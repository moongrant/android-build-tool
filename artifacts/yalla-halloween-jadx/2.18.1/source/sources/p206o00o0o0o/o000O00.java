package p206o00o0o0o;

import com.app.selectPicture.model.ImageModel;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00 implements Comparator<ImageModel> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f33254Oooo0o = true;

    @Override // java.util.Comparator
    public final int compare(ImageModel imageModel, ImageModel imageModel2) {
        long j = imageModel2.f12319Oooo0oO - imageModel.f12319Oooo0oO;
        if (j != 0) {
            return (!this.f33254Oooo0o ? j < 0 : j > 0) ? -1 : 1;
        }
        return 0;
    }
}
