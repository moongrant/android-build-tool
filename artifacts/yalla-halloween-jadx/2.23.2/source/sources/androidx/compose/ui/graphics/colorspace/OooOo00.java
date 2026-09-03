package androidx.compose.ui.graphics.colorspace;

import android.os.Bundle;
import androidx.media3.common.Oooo000;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.yalla.album.AlbumActivity;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo00 implements DoubleFunction, androidx.media3.common.OooO0OO.OooO00o, p138o00OOOo.OooOO0O {
    @Override // p138o00OOOo.OooOO0O
    public void OooO00o(AlbumActivity albumActivity, AlbumItem albumItem) {
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        String str = Oooo000.f6686OooO0oo;
        o00Oo0.OooO00o(bundle.getInt(androidx.media3.common.OooOo00.f6627OooO0Oo, -1) == 3);
        return bundle.getBoolean(Oooo000.f6686OooO0oo, false) ? new Oooo000(bundle.getBoolean(Oooo000.f6685OooO, false)) : new Oooo000();
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        return Rgb.DoubleIdentity$lambda$12(d);
    }
}
