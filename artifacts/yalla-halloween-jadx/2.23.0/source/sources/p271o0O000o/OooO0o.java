package p271o0O000o;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends ViewOutlineProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Chip f41664OooO00o;

    public OooO0o(Chip chip) {
        this.f41664OooO00o = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, @NonNull Outline outline) {
        OooO00o oooO00o = this.f41664OooO00o.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
