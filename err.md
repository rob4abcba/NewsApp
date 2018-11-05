
Alice Tong [Oct 29th at 11:45 PM]
Does anyone know what I need to fix for this error?
Error from logcat
2018-10-29 23:44:06.567 25126-25126/com.example.tongl.newsapp I/com.example.tongl.newsapp.MainActivity: TEST: onLoadFinished() called...
2018-10-29 23:44:06.649 25126-25126/com.example.tongl.newsapp E/AndroidRuntime: FATAL EXCEPTION: main
  Process: com.example.tongl.newsapp, PID: 25126
  java.lang.IllegalArgumentException
    at java.util.Date.parse(Date.java:638)
    at java.util.Date.<init>(Date.java:274)
    at com.example.tongl.newsapp.NewsAdapter.getView(NewsAdapter.java:53)
    at android.widget.AbsListView.obtainView(AbsListView.java:3189)
    at android.widget.ListView.makeAndAddView(ListView.java:2197)
    at android.widget.ListView.fillDown(ListView.java:824)
    at android.widget.ListView.fillFromTop(ListView.java:885)
    at android.widget.ListView.layoutChildren(ListView.java:1924)
    at android.widget.AbsListView.onLayout(AbsListView.java:2961)
    at android.view.View.layout(View.java:20836)
    at android.view.ViewGroup.layout(ViewGroup.java:6401)
    at android.widget.RelativeLayout.onLayout(RelativeLayout.java:1080)
    at android.view.View.layout(View.java:20836)
    at android.view.ViewGroup.layout(ViewGroup.java:6401)
    at android.widget.FrameLayout.layoutChildren(FrameLayout.java:323)
    at android.widget.FrameLayout.onLayout(FrameLayout.java:261)
    at android.view.View.layout(View.java:20836)
    at android.view.ViewGroup.layout(ViewGroup.java:6401)
    at android.support.v7.widget.ActionBarOverlayLayout.onLayout(ActionBarOverlayLayout.java:443)
    at android.view.View.layout(View.java:20836)
    at android.view.ViewGroup.layout(ViewGroup.java:6401)
    at android.widget.FrameLayout.layoutChildren(FrameLayout.java:323)
    at android.widget.FrameLayout.onLayout(FrameLayout.java:261)
    at android.view.View.layout(View.java:20836)
    at android.view.ViewGroup.layout(ViewGroup.java:6401)
    at android.widget.LinearLayout.setChildFrame(LinearLayout.java:1791)
    at android.widget.LinearLayout.layoutVertical(LinearLayout.java:1635)
    at android.widget.LinearLayout.onLayout(LinearLayout.java:1544)
    at android.view.View.layout(View.java:20836)
    at android.view.ViewGroup.layout(ViewGroup.java:6401)
    at android.widget.FrameLayout.layoutChildren(FrameLayout.java:323)
    at android.widget.FrameLayout.onLayout(FrameLayout.java:261)
    at com.android.internal.policy.DecorView.onLayout(DecorView.java:944)
    at android.view.View.layout(View.java:20836)
    at android.view.ViewGroup.layout(ViewGroup.java:6401)
    at android.view.ViewRootImpl.performLayout(ViewRootImpl.java:2948)
    at android.view.ViewRootImpl.performTraversals(ViewRootImpl.java:2635)
    at android.view.ViewRootImpl.doTraversal(ViewRootImpl.java:1779)
    at android.view.ViewRootImpl$TraversalRunnable.run(ViewRootImpl.java:7810)
    at android.view.Choreographer$CallbackRecord.run(Choreographer.java:911)
    at android.view.Choreographer.doCallbacks(Choreographer.java:723)
    at android.view.Choreographer.doFrame(Choreographer.java:658)
    at android.view.Choreographer$FrameDisplayEventReceiver.run(Choreographer.java:897)
    at android.os.Handler.handleCallback(Handler.java:789)
    at android.os.Handler.dispatchMessage(Handler.java:98)
    at android.os.Looper.loop(Looper.java:164)
    at android.app.ActivityThread.main(ActivityThread.java:6938)
    at java.lang.reflect.Method.invoke(Native Method)
    at com.android.internal.os.Zygote$MethodAndArgsCaller.run(Zygote.java:327)
    at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1374)
Collapse


3 replies
Lisa [ABND] [6 days ago]
Hey Alice Date.Parse is a deprecated method.  It's been replaced by DateFormate.parse which takes a string.
 


Iva.ProjectCoach [ABND] [6 days ago]
Hi @Alice Tong if you still need help on your project I can take a look now. Lisa is correct on the above error :100:


Alice Tong [5 days ago]
Thanks, @Lisa [ABND] and @Iva.ProjectCoach [ABND]!  I will try DateFormat.  I will ask if I cannot figure out how to implement @Iva.ProjectCoach [ABND]!
