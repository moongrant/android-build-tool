package p273o0O000o;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends ViewOutlineProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Chip f40972OooO00o;

    public OooO0OO(Chip chip) {
        this.f40972OooO00o = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, @NonNull Outline outline) {
        OooO00o oooO00o = this.f40972OooO00o.f16219OooO0oo;
        if (oooO00o != null) {
            oooO00o.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
