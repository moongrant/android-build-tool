package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.yalla.album.AlbumActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements o00O0OOO.OooOO0 {
    public static MeasurePolicy OooO0O0(Arrangement arrangement, Alignment.Horizontal horizontal, Composer composer, int i, int i2) {
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), horizontal, composer, i);
        composer.startReplaceableGroup(i2);
        return measurePolicyColumnMeasurePolicy;
    }

    @Override // o00O0OOO.OooOO0
    public void OooO00o(AlbumActivity albumActivity, AlbumItem albumItem) {
    }
}
