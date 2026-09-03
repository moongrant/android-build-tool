package p466o0OooO0;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalla.yalla.ui.fragment.MainMomentsTopicRecommendFragment;
import java.util.Objects;
import p168o00Ooo0.OooOo;
import p186o00o00Oo.o0ooOOo;
import p200o00o0Oo0.o0000Ooo;
import p457o0Ooo00O.o0OO00O;
import p458o0Ooo00o.oo0o0Oo;
import p583o0oOoOoo.l3;
import p583o0oOoOoo.n3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000O00 implements OooO0OO.OooO0O0, o0000Ooo, o0ooOOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f40506OooO0Oo;

    public /* synthetic */ o0000O00(Object obj) {
        this.f40506OooO0Oo = obj;
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        o000Oo0 o000oo1 = ((OooOO0.OooO0O0) this.f40506OooO0Oo).f13238Oooo0o;
        oooO00o.OooOoOO(o000oo1.f40564OooOO0, o000oo1.f40559OooO0Oo);
    }

    @Override // p200o00o0Oo0.o0000Ooo
    public final void OooO0o0(Object obj, Object obj2) {
        UCropActivity uCropActivity = (UCropActivity) this.f40506OooO0Oo;
        Bitmap.CompressFormat compressFormat = UCropActivity.f20297o0ooOoO;
        Objects.requireNonNull(uCropActivity);
        int iIntValue = ((Integer) obj2).intValue();
        if (iIntValue == 1010) {
            uCropActivity.onBackPressed();
            return;
        }
        if (iIntValue != 1011 || uCropActivity.f20307OoooOOo == null || uCropActivity.f20332ooOO == null) {
            return;
        }
        uCropActivity.f20319Ooooooo.setClickable(true);
        GestureCropImageView gestureCropImageView = uCropActivity.f20307OoooOOo;
        Bitmap.CompressFormat compressFormat2 = uCropActivity.f20332ooOO;
        int i = uCropActivity.f20321o00O0O;
        o0OO00O o0oo00o2 = new o0OO00O(uCropActivity);
        gestureCropImageView.OooOO0O();
        gestureCropImageView.setImageToWrapCropBounds(false);
        n3 n3Var = new n3(gestureCropImageView.f20352OooooOo, OooOo.OooO0oo(gestureCropImageView.f20422Oooo), gestureCropImageView.getCurrentScale(), gestureCropImageView.getCurrentAngle());
        int i2 = gestureCropImageView.f20359o00Ooo;
        int i3 = gestureCropImageView.f20360o00o0O;
        Uri imageInputPath = gestureCropImageView.getImageInputPath();
        Uri imageOutputPath = gestureCropImageView.getImageOutputPath();
        gestureCropImageView.getExifInfo();
        new oo0o0Oo(gestureCropImageView.getContext(), gestureCropImageView.getViewBitmap(), n3Var, new l3(i2, i3, compressFormat2, i, imageInputPath, imageOutputPath), o0oo00o2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        MainMomentsTopicRecommendFragment.m361initView$lambda2((MainMomentsTopicRecommendFragment) this.f40506OooO0Oo);
    }
}
