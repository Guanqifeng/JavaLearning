package com.guanqifeng.java;

/**
 * 垃圾回收器（Garbage Collection ）
 * 垃圾回收机制：
 * 1.发现无用的对象
 * 2.回收无用对象占用的空间
 * 垃圾回收的算法：
 * 1.引用计数法
 * 2.对象可达法
 * 通用的分代垃圾回收机制：
 * 1.分类：年轻代、年老代、持久代（反射对象）
 * 2.JVM将堆内存划分为：eden（年轻代）、survivor（年轻代）和tenured/old（年老代）
 * 垃圾回收过程：
 * 1.GC分类：Minor GC(用于清理年轻代区域)、Major GC(用于清理年老代区域)、
 *          Full GC用于清理年轻代、老年代区域。成本较高，会对系统性能产生影响。
 * 2.新创建的对象，绝大多数都会存储在eden中。
 * 3.当eden满了（达到一定比例）不能创建对象，则出发垃圾回收（Minor GC），将无用的对象清楚
 *   掉，然后剩余对象复制到Survivor中，如 s1，同事情况eden区
 * 4.当eden区再次满了，会将s1中的不能清空的对象存到另一个Survivor，如s2，同时将eden去中的
 *   不能清空的对象，也复制到s2中，保证eden和s1，均呗清空（Major GC）。
 * 5.重复多次【默认15次】Survivor中没有被清理的对象，会被复制到老年代old（Tenured）区。
 * 6.当Old区满了，则会出发一个一次完整的垃圾回收（Full GC）。
 * Full GC调优：
 *   尽量不要导致FULL GC
 */
public class GarbageCollectionPractice {

}
