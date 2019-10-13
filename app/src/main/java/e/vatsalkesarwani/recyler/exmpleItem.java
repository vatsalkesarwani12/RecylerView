package e.vatsalkesarwani.recyler;

public class exmpleItem {
    private  int mImageResourse;
    private String text1;
    private String text2;

    public exmpleItem( int imageResouce,String t1,String t2)
    {
        mImageResourse=imageResouce;
        text1=t1;
        text2=t2;
    }

    public int getmImageResourse()
    {
        return mImageResourse;
    }

    public String getText1()
    {
        return text1;
    }

    public String getText2()
    {
        return text2;
    }
}
