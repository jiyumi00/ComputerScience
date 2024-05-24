public class ImageProxy implements Image{
    private Image proxyImage;
    private String path;

    ImageProxy(String path){
        this.path=path;
    }
    @Override
    public void showImage() {
        //고해상도 이미지 로딩하기
        proxyImage=new HighResolutionImage(path);
        proxyImage.showImage();
    }
}
