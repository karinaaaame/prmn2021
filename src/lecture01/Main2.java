package lecture01;

public class Main2 {

    static int[] score = {41, 85, 72, 38, 80};

    public static void main(String[] args) {

        int saidai = max();
        int saishou = min();
        double heikin = average();
        String gouhi;

        for(int i=0;i<5;i++) {
            if(score[i]<60){
                gouhi="不可";
            }else if(score[i]<70) {
                gouhi="可";
            }else if(score[i]<80){
                gouhi="良";
            }else if(score[i]<90) {
                gouhi="優";
            }else {
                gouhi="秀";
            }
            System.out.println(i + "番　" + score[i] + "点 "+gouhi);
        }

        System.out.println("最高点：" + saidai + "\n最低点" + saishou + "\n平均点" + heikin);
    }

    static int max() {
        int ooki = score[0];
        for (int i = 1; i < 5; i++) {
            if (ooki < score[i]) {
                ooki = score[i];
            }
        }
        return ooki;
    }

    static int min() {
        int chisa = score[0];
        for (int i = 1; i < 5; i++) {
            if (chisa > score[i]) {
                chisa = score[i];
            }
        }
        return chisa;
    }

    static double average(){
        double mannaka,sum=0;
        for (int i=0 ; i<5 ; i++) {
            sum=score[i];
        }
        mannaka=sum/5;
        return mannaka;
        }
    }


