package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import android.view.SurfaceHolder;
import com.yy.yyeva.view.EvaAnimView;
import com.yy.yyeva.view.InnerSurfaceView;
import kotlin.jvm.internal.Intrinsics;
import p607o0oo0OOo.m1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f10585OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f10586OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f10587OooO0o0;

    public /* synthetic */ OooOOO0(Context context, AppEventsLoggerImpl appEventsLoggerImpl) {
        this.f10587OooO0o0 = context;
        this.f10586OooO0o = appEventsLoggerImpl;
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
        Context context = this.f10587OooO0o0;
        int i = this.f10585OooO0Oo;
        Object obj = this.f10586OooO0o;
        switch (i) {
            case 0:
                AppEventsLoggerImpl.Companion.m4062initializeLib$lambda4(context, (AppEventsLoggerImpl) obj);
                break;
            default:
                EvaAnimView this$0 = (EvaAnimView) obj;
                int i2 = EvaAnimView.f32973OooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(context, "$context");
                Log.i("EvaAnimPlayer.AnimView", "prepareTextureViewRunnable");
                this$0.removeAllViews();
                m1 m1Var = null;
                InnerSurfaceView innerSurfaceView = new InnerSurfaceView(context, 0 == true ? 1 : 0, 6, 0);
                m1 m1Var2 = this$0.f32975OooO0Oo;
                if (m1Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                } else {
                    m1Var = m1Var2;
                }
                innerSurfaceView.setPlayerEva(m1Var);
                innerSurfaceView.setLayoutParams(this$0.f32981OooOO0O.OooO0O0(innerSurfaceView));
                this$0.f32974OooO = innerSurfaceView;
                SurfaceHolder holder = innerSurfaceView.getHolder();
                if (holder != null) {
                    holder.addCallback(this$0);
                }
                this$0.addView(this$0.f32974OooO);
                break;
        }
    }

    public /* synthetic */ OooOOO0(EvaAnimView evaAnimView, Context context) {
        this.f10586OooO0o = evaAnimView;
        this.f10587OooO0o0 = context;
    }
}
