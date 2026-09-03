package androidx.camera.core.impl;

import android.content.Intent;
import com.facebook.appevents.codeless.ViewIndexer;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;
import p485o0o00O0.o00OOOOo;
import p585o0oOooOO.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00oOoo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3753OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f3754OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3755OooO0o0;

    public /* synthetic */ o00oOoo(int i, Object obj, Object obj2) {
        this.f3753OooO0Oo = i;
        this.f3755OooO0o0 = obj;
        this.f3754OooO0o = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3753OooO0Oo;
        Object obj = this.f3754OooO0o;
        Object obj2 = this.f3755OooO0o0;
        switch (i) {
            case 0:
                o00O000.OooO00o oooO00o = (o00O000.OooO00o) obj2;
                o00O000.OooO0O0 oooO0O0 = (o00O000.OooO0O0) obj;
                if (oooO00o.f3713OooO0Oo.get()) {
                    Throwable th = oooO0O0.f3717OooO0O0;
                    boolean z = th == null;
                    o00O00o0.OooO00o<? super T> oooO00o2 = oooO00o.f3715OooO0o0;
                    if (!z) {
                        th.getClass();
                        oooO00o2.onError(th);
                        return;
                    } else {
                        if (!(th == null)) {
                            throw new IllegalStateException("Result contains an error. Does not contain a value.");
                        }
                        oooO00o2.OooO00o(oooO0O0.f3716OooO00o);
                        return;
                    }
                }
                return;
            case 1:
                ViewIndexer.m4082schedule$lambda0((ViewIndexer) obj2, (TimerTask) obj);
                return;
            default:
                o00OOOOo detailBottomState = (o00OOOOo) obj2;
                Intent intent = (Intent) obj;
                Intrinsics.checkNotNullParameter(detailBottomState, "$detailBottomState");
                if (detailBottomState.f47861OooO00o.isDestroyed()) {
                    return;
                }
                detailBottomState.OooO0O0(true);
                FriendInfo friendInfo = (FriendInfo) intent.getSerializableExtra("Data");
                if (friendInfo != null) {
                    EditTextSpan editTextSpanOooO00o = detailBottomState.OooO00o();
                    UserInfo userInfo = friendInfo.getUserInfo();
                    Intrinsics.checkNotNull(userInfo);
                    String userName = userInfo.getUserName();
                    UserInfo userInfo2 = friendInfo.getUserInfo();
                    Intrinsics.checkNotNull(userInfo2);
                    editTextSpanOooO00o.OooO00o("@", new h(userName, userInfo2.getUserId()));
                    return;
                }
                return;
        }
    }
}
