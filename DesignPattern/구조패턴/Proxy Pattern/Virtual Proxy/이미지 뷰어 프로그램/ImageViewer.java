public class ImageViewer {
    public static void main(String[] args) {
        HighResolutionImage highResolutionImage1=new HighResolutionImage("./img/고행상도이미지_1");
        HighResolutionImage highResolutionImage2=new HighResolutionImage("./img/고행상도이미지_2");
        HighResolutionImage highResolutionImage3=new HighResolutionImage("./img/고행상도이미지_3");

        highResolutionImage2.showImage();
        //이미지를 준비하는 과정에서 시간이 많이 잡아먹는다
        //만일 사용자가 목록에서 이미지를 선택하기 전까지 궅이 이미지를 메모리에 준비시킬 필요가 있을까?
        //사용자가 목록에서 선택한 이미지만 로딩시키면 되지 않을까?
    }
}
