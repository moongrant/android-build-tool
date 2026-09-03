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
import p309o0O0o0oO.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f28000Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f28001Oooo0oO;

    public /* synthetic */ o00O0O(Object obj, int i) {
        this.f28000Oooo0o = i;
        this.f28001Oooo0oO = obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z = false;
        switch (this.f28000Oooo0o) {
            case 0:
                Activity activity = (Activity) this.f28001Oooo0oO;
                if (activity.isFinishing()) {
                    return;
                }
                Class<?> cls = o0OOO0o.f28009OooO00o;
                if (Build.VERSION.SDK_INT < 28) {
                    if ((!o0OOO0o.OooO00o() || o0OOO0o.f28013OooO0o != null) && (o0OOO0o.f28014OooO0o0 != null || o0OOO0o.f28012OooO0Oo != null)) {
                        try {
                            Object obj2 = o0OOO0o.f28011OooO0OO.get(activity);
                            if (obj2 != null && (obj = o0OOO0o.f28010OooO0O0.get(activity)) != null) {
                                Application application = activity.getApplication();
                                o0OOO0o.OooO00o oooO00o = new o0OOO0o.OooO00o(activity);
                                application.registerActivityLifecycleCallbacks(oooO00o);
                                Handler handler = o0OOO0o.f28015OooO0oO;
                                handler.post(new oo000o(oooO00o, obj2));
                                try {
                                    if (o0OOO0o.OooO00o()) {
                                        Method method = o0OOO0o.f28013OooO0o;
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } else {
                                        activity.recreate();
                                    }
                                    handler.post(new o00oO0o(application, oooO00o));
                                } catch (Throwable th) {
                                    o0OOO0o.f28015OooO0oO.post(new o00oO0o(application, oooO00o));
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
                CodelessManager.m134checkCodelessSession$lambda1((String) this.f28001Oooo0oO);
                return;
            case 2:
                Objects.requireNonNull((o000Oo0) this.f28001Oooo0oO);
                throw null;
            default:
                PostDetailCommentSonListActivity this$0 = (PostDetailCommentSonListActivity) this.f28001Oooo0oO;
                PostDetailCommentSonListActivity.OooO00o oooO00o2 = PostDetailCommentSonListActivity.f22473o0ooOOo;
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
