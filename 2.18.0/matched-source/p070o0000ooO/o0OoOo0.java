package p070o0000ooO;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import com.facebook.appevents.codeless.CodelessManager;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p310o0O0o0oO.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OoOo0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f28030Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f28031OoooO00;

    public /* synthetic */ o0OoOo0(Object obj, int i) {
        this.f28030Oooo = i;
        this.f28031OoooO00 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z = false;
        switch (this.f28030Oooo) {
            case 0:
                Activity activity = (Activity) this.f28031OoooO00;
                if (activity.isFinishing()) {
                    return;
                }
                Class<?> cls = o0ooOOo.f28032OooO00o;
                if (Build.VERSION.SDK_INT < 28) {
                    if ((!o0ooOOo.OooO00o() || o0ooOOo.f28036OooO0o != null) && (o0ooOOo.f28037OooO0o0 != null || o0ooOOo.f28035OooO0Oo != null)) {
                        try {
                            Object obj2 = o0ooOOo.f28034OooO0OO.get(activity);
                            if (obj2 != null && (obj = o0ooOOo.f28033OooO0O0.get(activity)) != null) {
                                Application application = activity.getApplication();
                                o0ooOOo.OooO00o oooO00o = new o0ooOOo.OooO00o(activity);
                                application.registerActivityLifecycleCallbacks(oooO00o);
                                Handler handler = o0ooOOo.f28038OooO0oO;
                                handler.post(new o00Ooo(oooO00o, obj2));
                                try {
                                    if (o0ooOOo.OooO00o()) {
                                        Method method = o0ooOOo.f28036OooO0o;
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } else {
                                        activity.recreate();
                                    }
                                    handler.post(new oo000o(application, oooO00o));
                                } catch (Throwable th) {
                                    o0ooOOo.f28038OooO0oO.post(new oo000o(application, oooO00o));
                                    throw th;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (z) {
                        return;
                    }
                    activity.recreate();
                    return;
                }
                activity.recreate();
                z = true;
                if (z) {
                    activity.recreate();
                    return;
                }
                return;
            case 1:
                CodelessManager.m134checkCodelessSession$lambda1((String) this.f28031OoooO00);
                return;
            case 2:
                Objects.requireNonNull((o000Oo0) this.f28031OoooO00);
                throw null;
            default:
                PostDetailCommentSonListActivity this$0 = (PostDetailCommentSonListActivity) this.f28031OoooO00;
                PostDetailCommentSonListActivity.OooO00o oooO00o2 = PostDetailCommentSonListActivity.f22492o0Oo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isDestroyed()) {
                    return;
                }
                try {
                    int size = this$0.OooOooo().getData().size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            PostCommentSonModel postCommentSonModel = this$0.OooOooo().getData().get(i);
                            if (postCommentSonModel == null || !postCommentSonModel.isLocalMessageDiscolor()) {
                                i++;
                            } else {
                                postCommentSonModel.setLocalMessageDiscolor(false);
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i != -1) {
                        this$0.OooOooo().notifyItemChanged(i + this$0.OooOooo().getHeaderLayoutCount());
                        return;
                    }
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
        }
    }
}
