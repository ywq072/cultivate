package adapter;
//��������
public class ClassAdapter extends Adaptee implements Target
{
    public void request()
    {
        specificRequest();
    }
}
