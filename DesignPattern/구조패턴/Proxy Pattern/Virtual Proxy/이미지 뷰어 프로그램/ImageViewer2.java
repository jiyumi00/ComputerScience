public class ImageViewer2 {
    public static void main(String[] args) {
        Image highResolutionImage1=new ImageProxy("./img/고행상도이미지_1");
        Image highResolutionImage2=new ImageProxy("./img/고행상도이미지_2");
        Image highResolutionImage3=new ImageProxy("./img/고행상도이미지_3");

        highResolutionImage2.showImage();
        //대상객체 대신, 프록시 객체에 할당함
        /*사용자가 showImage를 호출하면 그때서야 대상객체를 로드하여, 이미지를 메모리에 적재하고
        대상 객체의 showImage() 메서드를 위임호출함으로써 실제 메소드를 호출하는 시점에서 메모리
        적재가 이루어지기 떄문에 불필요한 자원낭비 발생 x */
    }
}
