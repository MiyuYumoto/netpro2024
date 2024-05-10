public class Renshu {

     // xを2倍にして返す関数
        public int doubleValue(int x) {
        return x * 2;
    }

    //  1からnまでの整数の合計値を返す
        public int sumUpToN(int n){
            int sum = 0;
            for(int i = 1; i<= n; i++){
                sum += i;
            }
            return sum;
        }

    //pからqまでの整数の合計値を返す
        public int sumFromPtoQ(int p, int q){
            if(p>q){
                return -1;// pがqより大きい場合は-1を返す
            }
            int sum = 0;
            for (int i = p; i <= q; i++) {
                sum += i;
            }
            return sum;
        }


    //配列の指定されたindexから以降の要素の合計値を返す
    public int sumFromArrayIndex(int[] a, int index){
        if(index < 0 || index >= a.length){
            return -1;//不正なindexの場合は-1を返す
        }

        int sum = 0;
        for (int i = index; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    //配列 a の中で最大の値を返す
    public int selectMaxValue(int[] a){
        int max = a[0];//最初の要素を仮の最大値にする
        for (int i = 1; i < a.length; i++){
            if (a[i] > max){
                max = a[i];//より大きい値が見つかれば更新
            }
        }
        return max;
    }

    //最大の値が入っている要素の位置（index）を返す。最大値が複数の場合は最小のindexを返す。
    public int selectMaxIndex(int[]a){
        int max = a[0]; // 最初の要素を仮の最大値とする
        int maxIndex = 0; // 最大値のindex
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i]; // より大きい値が見つかれば、最大値とそのindexを更新する
                maxIndex = i;
            } else if (a[i] == max && i < maxIndex) {
                maxIndex = i; // 最大値が複数あり、かつ現在のindexが最小の場合、indexを更新する
            }
        }
        return maxIndex;
    }

    //配列 p の i 番目と j 番目の要素を入れ替える。
    public void swapArrayElements(int[] p, int i, int j){
        int temp = p[i];
        p[i] = p[j];
        p[j] = temp;
    }

    //同じ長さの二つの配列 a と b の内容を入れ替える。
    public boolean swapTwoArrays(int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
        return true;
    }
}
