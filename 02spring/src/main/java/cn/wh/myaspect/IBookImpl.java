package cn.wh.myaspect;

public class IBookImpl implements IBook {
    @Override
    public void selectbook() {
        System.out.println("selectbook");
    }

    @Override
    public void updatebook() {
        System.out.println("update");
    }

    @Override
    public void insert() {
        System.out.println("insert");
    }

    @Override
    public void delete() {
        try {
            int num=5/0;
        }catch (Exception ex){

        }

        System.out.println("delete");
    }

    @Override
    public void Final() {
        System.out.println("Final");
    }

}
