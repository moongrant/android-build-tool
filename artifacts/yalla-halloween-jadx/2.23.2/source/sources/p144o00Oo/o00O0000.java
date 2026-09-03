package p144o00Oo;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o000OO.OooO;
import p154o00Oo0oo.oo0o0Oo;
import p174o00OooOo.o00OO00O;
import p279o0O00o0.OooO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0000<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO<List<Throwable>> f37714OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<? extends o000O00<Data, ResourceType, Transcode>> f37715OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f37716OooO0OO;

    public o00O0000(Class cls, Class cls2, Class cls3, List list, OooO0O0.OooO0OO oooO0OO) {
        this.f37714OooO00o = oooO0OO;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f37715OooO0O0 = list;
        this.f37716OooO0OO = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final o00oOoo OooO00o(int i, int i2, @NonNull oo0o0Oo oo0o0oo, com.bumptech.glide.load.data.OooO oooO, o000Oo0.OooO0OO oooO0OO) throws GlideException {
        OooO<List<Throwable>> oooO2 = this.f37714OooO00o;
        List<Throwable> listOooO0O0 = oooO2.OooO0O0();
        o00OO00O.OooO0O0(listOooO0O0);
        List<Throwable> list = listOooO0O0;
        try {
            List<? extends o000O00<Data, ResourceType, Transcode>> list2 = this.f37715OooO0O0;
            int size = list2.size();
            o00oOoo o00ooooOooO00o = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    o00ooooOooO00o = list2.get(i3).OooO00o(i, i2, oo0o0oo, oooO, oooO0OO);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (o00ooooOooO00o != null) {
                    break;
                }
            }
            if (o00ooooOooO00o != null) {
                oooO2.OooO00o(list);
                return o00ooooOooO00o;
            }
            throw new GlideException(this.f37716OooO0OO, new ArrayList(list));
        } catch (Throwable th) {
            oooO2.OooO00o(list);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f37715OooO0O0.toArray()) + '}';
    }
}
