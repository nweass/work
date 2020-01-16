学习顺序：

1.  了解概念
2.   练习例题
3.   根据变式题目改变或者优化

## 暴力枚举



## 排序

#### 冒泡排序：

###### 语言描述：

循环遍历排序的元素，依次比较相邻的两个元素，如果顺序错误就交换，直至没有元素交换，就完成排序。

###### 写法：

for循环嵌套

###### 时间复杂度：

length=n的数组，表达式= n*(n-1) / 2,   O(n^2)

###### 基本模式：

​	for(int i=0;i<=a.length-1;i++){

​		for(int j=0;j<=a.length-1-i;j++){

​			if(a[j]>a[j+1]){

​				n =a[j];

​				a[j]=a[j+1];

​				a[j+1] = n;

​			}

​		}

}

#### 选择排序

###### 语言描述：

循环遍历排序的元素，将最小元素与第一个元素交换，第二次在剩下元素中找到最小元素与第二位元素交换，以此类推，直到剩下一个元素（只移动不在排序后对应位置的元素）

###### 写法：

for循环嵌套

###### 时间复杂度：

length=n的数组， O(n^2)

###### 基本模式：

```java
    for (int i = 0; i < arr.length- 1; i++) {
        int index = i;
        int j;
        // 找出最小值得元素下标
        for (j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[index]) {
                index = j;//交换位置（下标）？
            }
        }
        int tmp = arr[index];//交换元素
        arr[index] = arr[i];
        arr[i] = tmp;
        System.out.println(Arrays.toString(arr));
```

swap()输入两参数，交换输入的参数
[参考链接](https://blog.csdn.net/changhangshi/article/details/82740541)

#### 快速排序

###### 语言描述：

以一个数为中心将序列分成两个部分，一边全是比它小，另一边全是比它大。直到每个数两边两部分只有一个元素，说明不存在还没排序的部分，排序完成

###### 时间复杂度：

length=n的数组， O(nlogn)

###### 基本模式：



    public static void main(String[] args) {
        int arr[] = {49、38、65、97、76、13、27、49};
        quickSort(arr, 0, 7);
        System.out.println(Arrays.toString(arr));
    }
     
    public static void quickSort(int[] arr, int left, int right) {
     
        if (left < right) {
            // 一次划分
            int mid = partion(arr, left, right);
            quickSort(arr, 0, mid - 1);
            quickSort(arr, mid + 1, right);
        }
    }
     
    public static void swap(int[] arr, int l, int r) {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
     
    }
     
    public static int partion(int[] arr, int left, int right) {
        // 轴值，默认选取数组的第一个数字
        while (left < right) {
            while (left < right && arr[left] <= arr[right]) {
                right--;
            }
            if (left<right){
                swap(arr, left, right);
            }
            while (left < right && arr[left] <= arr[right]) {
                left++;
            }
            if (left<right){
                swap(arr, left, right);
            }
        }
        return left;
    }

[参考链接](https://blog.csdn.net/changhangshi/article/details/82736203)

## 贪心算法

###### 语言描述：

将原问题拆分成几个小问题，每一步取得局部最优解，叠加（？）取得整体解（但不一定是最优解）

######  贪心算法每一步必须满足以下条件：

　　* 1、可行的：即它必须满足问题的约束。
  * 2、局部最优：他是当前步骤中所有可行选择中最佳的局部选择。
  * 3、不可更改：即选择一旦做出，在算法的后面步骤就不可改变了。

*注意*：
贪心算法不是对所有问题都能得到整体最优解，选择的贪心策略必须具备无后效性，即某个状态以后的过程不会影响以前的状态，只与当前状态有关

（以重量和价值为例，选择单位质量价值最大得物品？）

##### 疑问：

①~~适用于什么问题~~  一个属性总和受限，但希望另一个属性最大化

②  ~~什么是最优解~~    （以重量和价值为例，选择单位质量价值最大得物品？）

③ 

###### 例题： 

当作一种解题思想运用





## 递归

###### 语言描述：

* 逻辑类似数列的递推公式，求每一步的结果都与上一步的结果有关

* 使用方式是函数自我调用

###### 时间复杂度：

length=n的数组， O(nlogn)

***使用关键是理清递归逻辑***

注意递归结束条件，避免死循环

###### 例题：



## 深度优先搜索算法

###### 语言描述：

基本模式沿着树的深度遍历树的节点，尽可能深的搜索树的分支。当节点v的所有边都己被探寻过，搜索将回溯到发现节点v的那条边的起始节点。这一过程一直进行到已发现从源节点可达的所有节点为止。如果还存在未被发现的节点，则选择其中一个作为源节点并重复以上过程，整个进程反复进行直到所有节点都被访问为止。（？？？？）



## 广度优先搜索算法

###### 语言描述：

遍历第一层节点，没有找到目标，再遍历第二层节点，以此类推

方法

[参考链接]([https://blog.csdn.net/cg129054036/article/details/83512864#1%EF%BC%89%E5%9B%BE%E7%AE%80%E4%BB%8B](https://blog.csdn.net/cg129054036/article/details/83512864#1）图简介))

## 补充

树：

TreeNode、.left（进入当前节点的左节点）、.val（返回节点值）

节点：

队列：

##  简易爬虫

##### 避免爬虫：

模仿浏览器访问时的客户端代码

设置请求时间

cookie保持登录状态

### ②Xpath语法 获取信息

lxml库 网页解析文档

Xpath在文档中获取信息

