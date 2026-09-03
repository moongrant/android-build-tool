package p349o0OOO0oo;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.OooO00o;
import com.google.android.material.tabs.TabLayout;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p338o0OO0o0O.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends OooO00o {
    @Override // com.google.android.material.tabs.OooO00o
    public final void OooO0O0(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFOooO00o = OooO00o.OooO00o(tabLayout, view);
        float fOooO00o = f < 0.5f ? OooO0o.OooO00o(1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.5f, f) : OooO0o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFOooO00o.left, drawable.getBounds().top, (int) rectFOooO00o.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fOooO00o * 255.0f));
    }
}
