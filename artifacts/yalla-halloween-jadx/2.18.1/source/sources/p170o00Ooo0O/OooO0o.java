package p170o00Ooo0O;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import com.app.base.util.Player.Audio;
import com.yalla.yalla.ui.activity.room.SearchMusicActivity;
import java.util.List;
import p544o0o0OoOO.v6;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements MediaScannerConnection.OnScanCompletedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String[] f32677OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooO.OooO00o f32678OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Context f32679OooO0OO;

    public OooO0o(String[] strArr, OooO.OooO00o oooO00o, Context context) {
        this.f32677OooO00o = strArr;
        this.f32678OooO0O0 = oooO00o;
        this.f32679OooO0OO = context;
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) throws Throwable {
        OooO.OooO00o oooO00o;
        String[] strArr = this.f32677OooO00o;
        if (!strArr[strArr.length - 1].equals(str) || (oooO00o = this.f32678OooO0O0) == null) {
            return;
        }
        List<Audio> listOooO00o = OooO.OooO00o(this.f32679OooO0OO);
        v6 v6Var = (v6) oooO00o;
        SearchMusicActivity searchMusicActivity = v6Var.f44331OooO0O0;
        int i = SearchMusicActivity.f23016Oooooo0;
        searchMusicActivity.OooOoo0(listOooO00o);
        v6Var.f44330OooO00o.dismiss();
    }
}
