package p068o0000oo0;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.media.OooOo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class OooOOOO extends OooOo {
    public OooOOOO(Context context) {
        super(context);
        this.f6166OooO00o = context;
    }

    @Override // androidx.media.OooOo, androidx.media.OooOOOO.OooO00o
    public boolean OooO00o(@NonNull OooOo.OooO00o oooO00o) {
        return (this.f6166OooO00o.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", oooO00o.f6169OooO0O0, oooO00o.f6170OooO0OO) == 0) || super.OooO00o(oooO00o);
    }
}
