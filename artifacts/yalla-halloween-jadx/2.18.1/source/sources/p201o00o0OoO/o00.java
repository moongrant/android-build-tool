package p201o00o0OoO;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.OooO00o;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p193o00o0O00.o0OoOo0;
import p400o0Oo0O.OooOOO0;
import p400o0Oo0O.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class o00 extends o00O0000 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(@NotNull AppCompatActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // p201o00o0OoO.o00O0000
    public final void OooO0O0() {
        o0OoOo0 o0oooo1 = this.f33229OoooOo0;
        int i = o0oooo1.f33163OooOo0;
        int i2 = o0oooo1.f33165OooOo0O;
        if (i2 != -1 || i != -1) {
            OooO0Oo(i != -1 ? this.f33221Oooo.getString(i) : "", i2);
            this.f33223OoooO0.setVisibility(0);
        }
        o0OoOo0 o0oooo2 = this.f33229OoooOo0;
        int i3 = o0oooo2.f33166OooOo0o;
        int i4 = o0oooo2.f33162OooOo;
        this.f33225OoooO0O.setVisibility(0);
        if (i4 != -1) {
            OooO0o("", i4);
        } else if (i3 != -1) {
            OooO0o(this.f33221Oooo.getString(i3), -1);
        } else {
            OooO0o(this.f33221Oooo.getString(OooOOOO.select_picture_string_Done), -1);
        }
        this.f33226OoooOO0.setVisibility(8);
        this.f33222OoooO.setVisibility(0);
        int i5 = this.f33229OoooOo0.f33168OooOoO0;
        this.f33222OoooO.setTextColor(i5);
        this.f33223OoooO0.setTextColor(i5);
        this.f33225OoooO0O.setTextColor(i5);
        OooO0OO();
        OooO00o oooO00o = new OooO00o();
        oooO00o.OooO0o0(this.f33224OoooO00);
        int i6 = this.f33229OoooOo0.f33164OooOo00;
        if (i6 == 8388611) {
            oooO00o.OooOOOo(OooOOO0.include_title_tv_name, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        } else if (i6 == 17) {
            oooO00o.OooOOOo(OooOOO0.include_title_tv_name, 0.5f);
        } else if (i6 == 8388613) {
            oooO00o.OooOOOo(OooOOO0.include_title_tv_name, 1.0f);
        }
        oooO00o.OooO0O0(this.f33224OoooO00);
    }
}
