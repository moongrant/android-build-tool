package p168o00Ooo0;

import com.app.base.model.FaceModel;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO implements Comparator<FaceModel> {
    @Override // java.util.Comparator
    public final int compare(FaceModel faceModel, FaceModel faceModel2) {
        FaceModel faceModel3 = faceModel;
        try {
            return o0O0O00.OooOO0o(faceModel3.sHotKey.substring(9, 12)) < o0O0O00.OooOO0o(faceModel3.sHotKey.substring(9, 12)) ? -1 : 1;
        } catch (Exception unused) {
            return -1;
        }
    }
}
