package p358o0OOOooO;

import android.content.Intent;
import android.net.Uri;
import com.common.support.imagepicker.mediaedit.YLMediaEdit;
import com.yalla.album.CropImageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends Lambda implements Function2<Uri, Uri, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CropImageActivity f43779OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(CropImageActivity cropImageActivity) {
        super(2);
        this.f43779OooO0Oo = cropImageActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Uri uri, Uri uri2) {
        Uri origin = uri;
        Uri editUri = uri2;
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(editUri, "editUri");
        Intent callBackIntent = YLMediaEdit.INSTANCE.getCallBackIntent(origin, editUri);
        CropImageActivity cropImageActivity = this.f43779OooO0Oo;
        cropImageActivity.setResult(-1, callBackIntent);
        cropImageActivity.finish();
        return Unit.INSTANCE;
    }
}
