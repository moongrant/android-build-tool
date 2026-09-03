package p590o0oOooo0;

import com.yalla.yalla.model.FaceModel;
import java.util.Comparator;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class ooooO0O0 implements Comparator<FaceModel> {
    @Override // java.util.Comparator
    public final int compare(FaceModel faceModel, FaceModel faceModel2) {
        FaceModel faceModel3 = faceModel;
        try {
            return o0O0O0Oo.OooOO0O(faceModel3.sHotKey.substring(9, 12)) < o0O0O0Oo.OooOO0O(faceModel3.sHotKey.substring(9, 12)) ? -1 : 1;
        } catch (Exception unused) {
        }
    }
}
