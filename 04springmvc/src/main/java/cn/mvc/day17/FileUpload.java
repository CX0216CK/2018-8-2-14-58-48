package cn.mvc.day17;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
public class FileUpload  {
@RequestMapping("/first")
    public  String doupload(MultipartFile upload, HttpSession session){
    if (upload.getSize()>0) {
        /*获取上传文件的简单名称例如    1.txt*/
        String childrlPath = upload.getOriginalFilename();
        /*获得一个真实路径*/
        String parentPath = session.getServletContext().getRealPath("/day17/upload");
        System.out.println(parentPath + "==========");
        /*获取一个完整的文件对象*/
        File file = new File(parentPath, childrlPath);
        /*传输创建到本地*/
        try {
            upload.transferTo(file);
            /*上传成功*/
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*上传失败*/
    return "fileupload";
}


}
