// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/ParserRobot202310.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class ParserRobot202310 {
  public static Object toSet(Object C) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v1=$newSet();
      $v2:for (Object x:GCollections.unmodifiableCollection(C)) {
        $v1.add(x);
      }
      $result=$v1;
      if (true) break $try;
      $line=3;
      $rethrow(new RuntimeException("The function \"toSet(C:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,ParserRobot202310.class,"toSet",$line);
    }
    return $result;
  }
  public static IPushdownAutomaton createParser(Object A) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=7;
      Object Q=$fix($opIntvlY(0,95));
      $line=9;
      Object \u03A3=$fix($opUnionY(ParserRobot202310.toSet(A),GCollections.asSet(' ','\n')));
      $line=11;
      Object \u0393=$fix(GCollections.asSet('1'));
      $line=12;
      Object q_0=$fix(0);
      $line=13;
      Object F=$fix(GCollections.asSet(95));
      $line=14;
      Object M=$fix($invokeConstructor(GPushdownAutomaton.class,new Object[]{Q,\u03A3,\u0393,q_0,F}));
      $line=15;
      Object SkipChars=$fix(GCollections.asSet(' ','\n'));
      $line=17;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(20,10,$cast(java.lang.String.class,';')),new Object[]{});
      $line=18;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(6,8,$cast(java.lang.String.class,'|')),new Object[]{"1"});
      $line=19;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,21,$cast(java.lang.String.class,'g')),new Object[]{});
      $line=20;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(16,17,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=21;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(21,22,$cast(java.lang.String.class,':')),new Object[]{});
      $line=22;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(22,23,$cast(java.lang.String.class,'#')),new Object[]{});
      $line=23;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(8,9,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=24;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(8,10,$cast(java.lang.String.class,'|')),new Object[]{"1"});
      $line=25;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(9,9,$cast(java.lang.String.class,',')),new Object[]{"1"});
      $line=26;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,13,$cast(java.lang.String.class,'a')),new Object[]{});
      $line=27;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(13,14,$cast(java.lang.String.class,':')),new Object[]{});
      $line=28;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,1,$cast(java.lang.String.class,'R')),new Object[]{});
      $line=29;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(1,2,$cast(java.lang.String.class,'V')),new Object[]{});
      $line=30;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(19,20,$cast(java.lang.String.class,'d')),new Object[]{});
      $line=31;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(9,9,$cast(java.lang.String.class,'v')),new Object[]{"1"});
      $line=32;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(9,10,$cast(java.lang.String.class,'|')),new Object[]{"1"});
      $line=33;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(22,23,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=34;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(23,24,$cast(java.lang.String.class,',')),new Object[]{});
      $line=35;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(14,15,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=36;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(24,25,$cast(java.lang.String.class,'#')),new Object[]{});
      $line=37;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(24,25,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=38;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(25,95,$cast(java.lang.String.class,']')),new Object[]{"1"});
      $line=39;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(25,10,$cast(java.lang.String.class,';')),new Object[]{});
      $line=40;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,26,$cast(java.lang.String.class,'m')),new Object[]{});
      $line=41;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(14,15,$cast(java.lang.String.class,'#')),new Object[]{});
      $line=42;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(17,95,$cast(java.lang.String.class,']')),new Object[]{"1"});
      $line=43;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(2,3,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=44;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(3,3,$cast(java.lang.String.class,',')),new Object[]{"1"});
      $line=45;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(11,4,$cast(java.lang.String.class,'P')),new Object[]{});
      $line=46;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(4,5,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=47;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(5,6,$cast(java.lang.String.class,'[')),new Object[]{"1"});
      $line=48;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(17,10,$cast(java.lang.String.class,';')),new Object[]{});
      $line=49;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,18,$cast(java.lang.String.class,'t')),new Object[]{});
      $line=50;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(18,19,$cast(java.lang.String.class,':')),new Object[]{});
      $line=51;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,34,$cast(java.lang.String.class,'M')),new Object[]{});
      $line=52;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(34,35,$cast(java.lang.String.class,':')),new Object[]{});
      $line=53;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(35,36,$cast(java.lang.String.class,'#')),new Object[]{});
      $line=54;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(26,27,$cast(java.lang.String.class,':')),new Object[]{});
      $line=55;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(27,28,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=56;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(20,95,$cast(java.lang.String.class,']')),new Object[]{"1"});
      $line=57;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(27,28,$cast(java.lang.String.class,'#')),new Object[]{});
      $line=58;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(35,36,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=59;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(28,95,$cast(java.lang.String.class,']')),new Object[]{"1"});
      $line=60;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(15,16,$cast(java.lang.String.class,',')),new Object[]{});
      $line=61;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(28,10,$cast(java.lang.String.class,';')),new Object[]{});
      $line=62;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,29,$cast(java.lang.String.class,'p')),new Object[]{});
      $line=63;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(33,95,$cast(java.lang.String.class,']')),new Object[]{"1"});
      $line=64;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(33,10,$cast(java.lang.String.class,';')),new Object[]{});
      $line=65;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(33,55,$cast(java.lang.String.class,'T')),new Object[]{"1"});
      $line=66;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(33,52,$cast(java.lang.String.class,'D')),new Object[]{"1"});
      $line=67;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(37,38,$cast(java.lang.String.class,'d')),new Object[]{});
      $line=68;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(38,95,$cast(java.lang.String.class,']')),new Object[]{"1"});
      $line=69;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(38,10,$cast(java.lang.String.class,';')),new Object[]{});
      $line=70;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(38,55,$cast(java.lang.String.class,'T')),new Object[]{"1"});
      $line=71;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(38,52,$cast(java.lang.String.class,'D')),new Object[]{"1"});
      $line=72;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,39,$cast(java.lang.String.class,'I')),new Object[]{});
      $line=73;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(36,37,$cast(java.lang.String.class,',')),new Object[]{});
      $line=74;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(29,30,$cast(java.lang.String.class,':')),new Object[]{});
      $line=75;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(30,31,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=76;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(30,31,$cast(java.lang.String.class,'#')),new Object[]{});
      $line=77;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(3,3,$cast(java.lang.String.class,'v')),new Object[]{"1"});
      $line=78;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(3,11,$cast(java.lang.String.class,';')),new Object[]{});
      $line=79;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(31,32,$cast(java.lang.String.class,',')),new Object[]{});
      $line=80;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(42,43,$cast(java.lang.String.class,'c')),new Object[]{});
      $line=81;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(43,95,$cast(java.lang.String.class,']')),new Object[]{"1"});
      $line=82;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(43,10,$cast(java.lang.String.class,';')),new Object[]{});
      $line=83;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(43,55,$cast(java.lang.String.class,'T')),new Object[]{"1"});
      $line=84;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(43,52,$cast(java.lang.String.class,'D')),new Object[]{"1"});
      $line=85;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,44,$cast(java.lang.String.class,'n')),new Object[]{});
      $line=86;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(44,45,$cast(java.lang.String.class,':')),new Object[]{});
      $line=87;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(45,95,$cast(java.lang.String.class,']')),new Object[]{"1"});
      $line=88;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(32,33,$cast(java.lang.String.class,'B')),new Object[]{});
      $line=89;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(39,40,$cast(java.lang.String.class,':')),new Object[]{});
      $line=90;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(40,41,$cast(java.lang.String.class,'#')),new Object[]{});
      $line=91;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(40,41,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=92;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(41,42,$cast(java.lang.String.class,',')),new Object[]{});
      $line=93;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(48,95,$cast(java.lang.String.class,']')),new Object[]{"1"});
      $line=94;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(45,10,$cast(java.lang.String.class,';')),new Object[]{});
      $line=95;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,46,$cast(java.lang.String.class,'f')),new Object[]{});
      $line=96;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(95,5,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=97;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(46,47,$cast(java.lang.String.class,':')),new Object[]{});
      $line=98;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(47,48,$cast(java.lang.String.class,'c')),new Object[]{});
      $line=99;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(49,10,$cast(java.lang.String.class,':')),new Object[]{});
      $line=100;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(95,95,$cast(java.lang.String.class,']')),new Object[]{"1"});
      $line=101;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(95,57,$cast(java.lang.String.class,'e')),new Object[]{"1"});
      $line=102;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(95,10,$cast(java.lang.String.class,'[')),new Object[]{"1"});
      $line=103;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,51,$cast(java.lang.String.class,'w')),new Object[]{});
      $line=104;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(51,10,$cast(java.lang.String.class,':')),new Object[]{"1"});
      $line=105;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(48,10,$cast(java.lang.String.class,';')),new Object[]{});
      $line=106;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(48,55,$cast(java.lang.String.class,'T')),new Object[]{"1"});
      $line=107;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(48,52,$cast(java.lang.String.class,'D')),new Object[]{"1"});
      $line=108;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(53,10,$cast(java.lang.String.class,'[')),new Object[]{"1"});
      $line=109;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(52,53,$cast(java.lang.String.class,':')),new Object[]{});
      $line=110;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,54,$cast(java.lang.String.class,'i')),new Object[]{});
      $line=111;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,49,$cast(java.lang.String.class,'0')),new Object[]{});
      $line=112;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,62,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=113;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(59,60,$cast(java.lang.String.class,':')),new Object[]{});
      $line=114;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(60,61,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=115;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(60,61,$cast(java.lang.String.class,'#')),new Object[]{});
      $line=116;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(61,10,$cast(java.lang.String.class,'[')),new Object[]{"1"});
      $line=117;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(63,64,$cast(java.lang.String.class,'v')),new Object[]{});
      $line=118;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(62,63,$cast(java.lang.String.class,':')),new Object[]{});
      $line=119;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(63,10,$cast(java.lang.String.class,';')),new Object[]{});
      $line=120;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(63,95,$cast(java.lang.String.class,']')),new Object[]{"1"});
      $line=121;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(63,64,$cast(java.lang.String.class,'#')),new Object[]{});
      $line=122;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(54,10,$cast(java.lang.String.class,':')),new Object[]{"11"});
      $line=123;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(55,56,$cast(java.lang.String.class,':')),new Object[]{});
      $line=124;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(56,10,$cast(java.lang.String.class,'[')),new Object[]{"1"});
      $line=125;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(57,58,$cast(java.lang.String.class,':')),new Object[]{});
      $line=126;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(58,10,$cast(java.lang.String.class,'[')),new Object[]{"1"});
      $line=127;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,59,$cast(java.lang.String.class,'r')),new Object[]{});
      $line=128;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(64,64,$cast(java.lang.String.class,',')),new Object[]{"1"});
      $line=129;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(63,64,$cast(java.lang.String.class,'B')),new Object[]{});
      $line=130;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(63,64,$cast(java.lang.String.class,'c')),new Object[]{});
      $line=131;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(63,64,$cast(java.lang.String.class,'d')),new Object[]{});
      $line=132;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(64,64,$cast(java.lang.String.class,'c')),new Object[]{"1"});
      $line=133;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(64,64,$cast(java.lang.String.class,'d')),new Object[]{"1"});
      $line=134;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(64,10,$cast(java.lang.String.class,';')),new Object[]{});
      $line=135;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(64,95,$cast(java.lang.String.class,']')),new Object[]{"1"});
      $line=136;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(64,64,$cast(java.lang.String.class,'v')),new Object[]{"1"});
      $line=137;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(64,64,$cast(java.lang.String.class,'#')),new Object[]{"1"});
      $line=138;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(64,64,$cast(java.lang.String.class,'B')),new Object[]{"1"});
      $line=146;
      for (Object $v3:GCollections.unmodifiableCollection(Q)) {
        Object q=$v3;
        $line=147;
        for (Object $v4:GCollections.unmodifiableCollection(SkipChars)) {
          Object s=$v4;
          $line=148;
          $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(q,q,$cast(java.lang.String.class,$opAdditY("",s))),new Object[]{});
        }
      }
      $line=153;
      $result=M;
      if (true) break $try;
      $line=154;
      $rethrow(new RuntimeException("The function \"createParser(A:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,ParserRobot202310.class,"createParser",$line);
    }
    return $cast(IPushdownAutomaton.class,$result);
  }
}
