package p700oO0Oo;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import java.io.File;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.o0OOO0o;
import p254o00ooO0O.o000Oo0;
import p456o0Ooo000.OooOo00;
import p494o0o00OO0.OooO0o;
import p649o0ooOOoo.cc;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f52862OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final PrivateChatActivity f52863OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public cc f52864OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public String f52865OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OOO0o f52866OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f52867OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f52868OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooOo00 f52869OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f52870OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Timer f52871OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o0000Ooo f52872OooOO0O;

    public o0000(@NotNull PrivateChatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f52863OooO00o = activity;
        this.f52866OooO0Oo = new o0OOO0o(activity);
        this.f52867OooO0o = OooO0o.f41155OooO00o.OooO0OO().getPath() + File.separator;
        this.f52869OooO0oO = new OooOo00();
    }

    public final void OooO00o() {
        cc ccVar = this.f52864OooO0O0;
        cc ccVar2 = null;
        if (ccVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar = null;
        }
        ccVar.f49098OooO0oO.f49750OooO0oO.setVisibility(8);
        cc ccVar3 = this.f52864OooO0O0;
        if (ccVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar3 = null;
        }
        ccVar3.f49098OooO0oO.f49751OooO0oo.setVisibility(8);
        cc ccVar4 = this.f52864OooO0O0;
        if (ccVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar4 = null;
        }
        ccVar4.f49097OooO0o0.f49552OooO0oO.setImageResource(R.drawable.btn_chitchat_voice_n);
        cc ccVar5 = this.f52864OooO0O0;
        if (ccVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ccVar2 = ccVar5;
        }
        ccVar2.f49097OooO0o0.f49547OooO0O0.setVisibility(0);
    }

    public final void OooO0O0(final int i) {
        this.f52863OooO00o.runOnUiThread(new Runnable() { // from class: oO0Oo.o00000O
            @Override // java.lang.Runnable
            public final void run() {
                o0000 this$0 = this.f52878Oooo0o;
                int i2 = i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cc ccVar = this$0.f52864OooO0O0;
                if (ccVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    ccVar = null;
                }
                TextView textView = ccVar.f49098OooO0oO.f49752OooOO0;
                StringBuilder sb = new StringBuilder();
                sb.append(o000Oo0.OooO0Oo(Float.valueOf((30000.0f - i2) / 1000)));
                sb.append(Typography.quote);
                textView.setText(sb.toString());
            }
        });
    }
}
