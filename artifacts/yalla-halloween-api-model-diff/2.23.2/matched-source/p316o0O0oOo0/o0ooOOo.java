package p316o0O0oOo0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.firebase.perf.util.OooO;
import com.google.firebase.perf.util.OooOO0O;
import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p058o0000Ooo.o00Oo0;
import p233o00oOoOO.o0OoO00O;
import p301o0O0o0O.OooO0o;
import p309o0O0oO0.o000OOo0;
import p309o0O0oO0.o00O000;
import p321o0O0oo0O.o000000;
import p626o0ooO.o0OOO0o;
import p678oooOO0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f41936OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f41937OooO0o0;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f41936OooO0Oo = i;
        this.f41937OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00O000 o00o001;
        String strOooO00o;
        String str;
        String str2;
        int i = 2;
        switch (this.f41936OooO0Oo) {
            case 0:
                o0OO00O o0oo00o2 = (o0OO00O) this.f41937OooO0o0;
                o0OOO0o o0ooo0o2 = o0oo00o2.f41919OooO0oO;
                o0ooo0o2.OooO00o();
                Context context = o0ooo0o2.f57662OooO00o;
                o0oo00o2.f41925OooOOO0 = context;
                o0oo00o2.f41928OooOOo = context.getPackageName();
                o0oo00o2.f41924OooOOO = o000OOo0.OooO0o0();
                o0oo00o2.f41926OooOOOO = new o00oO0o(o0oo00o2.f41925OooOOO0, new OooOO0O(100L, 1L, TimeUnit.MINUTES));
                o0oo00o2.f41927OooOOOo = oo0o0Oo.OooO00o();
                OooO0o<o0OoO00O> oooO0o = o0oo00o2.f41921OooOO0;
                o000OOo0 o000ooo1 = o0oo00o2.f41924OooOOO;
                o000ooo1.getClass();
                o00O000 o00o002 = o00O000.f41794OooO00o;
                synchronized (o00O000.class) {
                    if (o00O000.f41794OooO00o == null) {
                        o00O000.f41794OooO00o = new o00O000();
                    }
                    o00o001 = o00O000.f41794OooO00o;
                }
                if (o000000.f42030OooO00o.booleanValue()) {
                    o00o001.getClass();
                    strOooO00o = "FIREPERF";
                } else {
                    o00o001.getClass();
                    long jLongValue = ((Long) o000ooo1.f41785OooO00o.getRemoteConfigValueOrDefault("fpr_log_source", -1L)).longValue();
                    Map<Long, String> map = o00O000.f41795OooO0O0;
                    if (!map.containsKey(Long.valueOf(jLongValue)) || (str = map.get(Long.valueOf(jLongValue))) == null) {
                        OooO<String> oooOOooO0Oo = o000ooo1.OooO0Oo(o00o001);
                        strOooO00o = oooOOooO0Oo.OooO0O0() ? oooOOooO0Oo.OooO00o() : "FIREPERF";
                    } else {
                        o000ooo1.f41787OooO0OO.OooO0o0("com.google.firebase.perf.LogSourceName", str);
                        strOooO00o = str;
                    }
                }
                o0oo00o2.f41922OooOO0O = new o00Ooo(oooO0o, strOooO00o);
                o0oo00o2.f41927OooOOOo.OooO0Oo(new WeakReference<>(o0OO00O.f41914OooOo0O));
                ApplicationInfo.OooO0O0 oooO0O0NewBuilder = ApplicationInfo.newBuilder();
                o0oo00o2.f41929OooOOo0 = oooO0O0NewBuilder;
                o0OOO0o o0ooo0o3 = o0oo00o2.f41919OooO0oO;
                o0ooo0o3.OooO00o();
                oooO0O0NewBuilder.OooO0oo(o0ooo0o3.f57664OooO0OO.f57675OooO0O0);
                AndroidApplicationInfo.OooO0O0 oooO0O0NewBuilder2 = AndroidApplicationInfo.newBuilder();
                oooO0O0NewBuilder2.OooO0O0(o0oo00o2.f41928OooOOo);
                oooO0O0NewBuilder2.OooO0Oo();
                Context context2 = o0oo00o2.f41925OooOOO0;
                try {
                    str2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    while (true) {
                        ConcurrentLinkedQueue<oo000o> concurrentLinkedQueue = o0oo00o2.f41918OooO0o0;
                        if (concurrentLinkedQueue.isEmpty()) {
                            return;
                        }
                        oo000o oo000oVarPoll = concurrentLinkedQueue.poll();
                        if (oo000oVarPoll != null) {
                            o0oo00o2.f41923OooOO0o.execute(new o00Oo0(i, o0oo00o2, oo000oVarPoll));
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                oooO0O0NewBuilder2.OooO0o0(str2);
                oooO0O0NewBuilder.OooO0o0(oooO0O0NewBuilder2);
                o0oo00o2.f41917OooO0o.set(true);
                break;
            case 1:
                TopicEditDescActivity this$0 = (TopicEditDescActivity) this.f41937OooO0o0;
                int i2 = TopicEditDescActivity.f25898OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText view = this$0.OooOo().f45041OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "etDesc");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context3 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o0OOO0o.OooO00o(context3);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                return;
            default:
                UserInfoEditActivity this$1 = (UserInfoEditActivity) this.f41937OooO0o0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                int i3 = UserInfoEditActivity.f26818Oooo0oO;
                EditText view2 = this$1.OooOoO().f45657OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view2, "etName");
                Intrinsics.checkNotNullParameter(view2, "view");
                Context context4 = view2.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o2 = p371o0OOo0oO.o0OOO0o.OooO00o(context4);
                view2.setFocusable(true);
                view2.setFocusableInTouchMode(true);
                view2.requestFocus();
                inputMethodManagerOooO00o2.showSoftInput(view2, 2, new KeyBoardUtil$showKeyboard$1(view2.getContext().getApplicationContext(), new Handler()));
                return;
        }
    }
}
