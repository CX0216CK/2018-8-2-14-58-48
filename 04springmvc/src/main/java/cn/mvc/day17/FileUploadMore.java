package cn.mvc.day17;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadMore {
/*多文件版本*/
@RequestMapping("/second")
public String fileuploadsecond(@RequestParam MultipartFile[]upload, HttpSession session){
    for (MultipartFile item : upload) {
        if (item.getSize() > 0) {
            /*获取上传文件的简单名称例如    1.txt*/
            String childrlPath = item.getOriginalFilename();
            /*获得一个真实路径*/
            String parentPath = session.getServletContext().getRealPath("/day17/upload");
            /*获取一个完整的文件对象*/
            File file = new File(parentPath, childrlPath);
            /*传输创建到本地*/
            try {
                item.transferTo(file);
                /*上传成功*/

            } catch (IOException e) {
                e.printStackTrace();
                return "fileuploadmore";
            }
        }
    }


    /*上传失败*/
    return "success";
}



}
