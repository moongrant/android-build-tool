package p519o0o0O0oO;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.google.android.exoplayer2.ui.o00oO0o;
import com.google.android.exoplayer2.ui.oo000o;
import com.yalla.yalla.model.UpdateAppModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p031OoooO0.o0OoOo0;
import p157o00OoOO0.Oooo0;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.y1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUpdateAppDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateAppDialog.kt\ncom/yalla/yalla/ui/dialog/UpdateAppDialog\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,123:1\n23#2:124\n*S KotlinDebug\n*F\n+ 1 UpdateAppDialog.kt\ncom/yalla/yalla/ui/dialog/UpdateAppDialog\n*L\n64#1:124\n*E\n"})
public final class p4 extends Oooo0<p4> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f53087OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f53088OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(@NotNull final BaseActivityK context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53087OooO0oO = new o000O0Oo(Reflection.getOrCreateKotlinClass(y1.class), context, new o4(this));
        this.f53088OooO0oo = true;
        OooOOO0().f59373OooO0o0.setMovementMethod(ScrollingMovementMethod.getInstance());
        OooOOO0().f59370OooO0OO.setOnClickListener(new oo000o(this, 2));
        OooOOO0().f59369OooO0O0.setOnClickListener(new o00oO0o(this, 1));
        OooOOO0().f59371OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.n4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent;
                boolean z;
                p4 this$0 = this.f52440OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context2 = context;
                Intrinsics.checkNotNullParameter(context2, "$context");
                this$0.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                try {
                    try {
                        Intent launchIntentForPackage = context2.getPackageManager().getLaunchIntentForPackage("com.android.vending");
                        if (launchIntentForPackage != null) {
                            launchIntentForPackage.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.activities.LaunchUrlHandlerActivity"));
                            launchIntentForPackage.setData(Uri.parse("market://details?id=" + context2.getPackageName()));
                            context2.startActivity(launchIntentForPackage);
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            intent = new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + context2.getPackageName()));
                            context2.startActivity(intent);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + context2.getPackageName()));
                    }
                    this$0.OooO0OO();
                } catch (Throwable th) {
                    context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + context2.getPackageName())));
                    throw th;
                }
            }
        });
    }

    public final void OooOOO(@Nullable UpdateAppModel updateAppModel) {
        if (updateAppModel != null) {
            OooOOO0().f59374OooO0oO.setText(o00O00OO.OooO00o("V ", updateAppModel.getTargetVersionName()));
            OooOOO0().f59372OooO0o.setText(o0000.OooO0OO(oO00OOo0.updata_pop_tops_title));
            OooOOO0().f59373OooO0o0.setText(o0OoOo0.OooO00o(o0000.OooO0OO(oO00OOo0.updata_pop_tops_content), "\n", updateAppModel.getContent()));
            OooOOO0().f59371OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.Upgrade));
            if (com.code.android.util.o0OoOo0.OooO0OO(updateAppModel.getTargetVersionCode(), 0.0d) <= com.code.android.util.o0OoOo0.OooO0OO(updateAppModel.getCurrentVersionCode(), 0.0d)) {
                OooO0OO();
                return;
            }
            this.f53088OooO0oo = true;
            OooOOO0().f59369OooO0O0.setVisibility(0);
            if (updateAppModel.getUpApkCode() == 2) {
                this.f53088OooO0oo = false;
                OooOOO0().f59369OooO0O0.setVisibility(8);
                OooO0o(this.f53088OooO0oo);
            }
            OooOO0o();
        }
    }

    @NotNull
    public final y1 OooOOO0() {
        return (y1) this.f53087OooO0oO.getValue();
    }
}
