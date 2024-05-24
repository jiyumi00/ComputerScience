public class HighResolutionImage implements Image {
    String img;
    HighResolutionImage(String path){
        loadImage(path);
    }
    private void loadImage(String path){
        //이미지를 디스크에서 불러와 메모리에 적재
        //작업 자체가 무겁고 많은 자원을 필요로 함

        try{
            Thread.sleep(1000);
            img=path;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.printf("%s에 있는 이미지 로딩 완료\n",path);
    }

    public void showImage(){
        //이미지를 화면에 렌더링
        System.out.printf("%s 이미지 출력\n",img);
    }
}
