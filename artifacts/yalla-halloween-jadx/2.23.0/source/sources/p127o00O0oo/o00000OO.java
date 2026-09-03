package p127o00O0oo;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o000OO.OooO;
import o00OOO.OooO00o;
import p126o00O0oOo.o00000;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO<List<Throwable>> f36750OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<? extends o0OO00O<Data, ResourceType, Transcode>> f36751OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f36752OooO0OO;

    public o00000OO(Class cls, Class cls2, Class cls3, List list, OooO00o.OooO0OO oooO0OO) {
        this.f36750OooO00o = oooO0OO;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f36751OooO0O0 = list;
        this.f36752OooO0OO = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final o0000 OooO00o(int i, int i2, @NonNull o00000 o00000Var, com.bumptech.glide.load.data.OooO oooO, o0Oo0oo.OooO0OO oooO0OO) throws GlideException {
        OooO<List<Throwable>> oooO2 = this.f36750OooO00o;
        List<Throwable> listOooO0O0 = oooO2.OooO0O0();
        o0000O00.OooO0O0(listOooO0O0);
        List<Throwable> list = listOooO0O0;
        try {
            List<? extends o0OO00O<Data, ResourceType, Transcode>> list2 = this.f36751OooO0O0;
            int size = list2.size();
            o0000 o0000VarOooO00o = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    o0000VarOooO00o = list2.get(i3).OooO00o(i, i2, o00000Var, oooO, oooO0OO);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (o0000VarOooO00o != null) {
                    break;
                }
            }
            if (o0000VarOooO00o != null) {
                oooO2.OooO00o(list);
                return o0000VarOooO00o;
            }
            throw new GlideException(this.f36752OooO0OO, new ArrayList(list));
        } catch (Throwable th) {
            oooO2.OooO00o(list);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f36751OooO0O0.toArray()) + '}';
    }
}
