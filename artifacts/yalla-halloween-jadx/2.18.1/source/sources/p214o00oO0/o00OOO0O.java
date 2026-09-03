package p214o00oO0;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import o000OO0O.OooO;
import p217o00oO00o.o00000;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0O<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO<List<Throwable>> f33510OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<? extends oo0oOO0<Data, ResourceType, Transcode>> f33511OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f33512OooO0OO;

    public o00OOO0O(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<oo0oOO0<Data, ResourceType, Transcode>> list, OooO<List<Throwable>> oooO) {
        this.f33510OooO00o = oooO;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f33511OooO0O0 = list;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Failed LoadPath{");
        sbOooO0o0.append(cls.getSimpleName());
        sbOooO0o0.append("->");
        sbOooO0o0.append(cls2.getSimpleName());
        sbOooO0o0.append("->");
        sbOooO0o0.append(cls3.getSimpleName());
        sbOooO0o0.append("}");
        this.f33512OooO0OO = sbOooO0o0.toString();
    }

    public final o00OOOO0<Transcode> OooO00o(com.bumptech.glide.load.data.OooO<Data> oooO, @NonNull o00000 o00000Var, int i, int i2, oo0oOO0.OooO00o<ResourceType> oooO00o) throws GlideException {
        List<Throwable> listOooO0O0 = this.f33510OooO00o.OooO0O0();
        Objects.requireNonNull(listOooO0O0, "Argument must not be null");
        List<Throwable> list = listOooO0O0;
        try {
            int size = this.f33511OooO0O0.size();
            o00OOOO0<Transcode> o00oooo0OooO00o = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    o00oooo0OooO00o = this.f33511OooO0O0.get(i3).OooO00o(oooO, i, i2, o00000Var, oooO00o);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (o00oooo0OooO00o != null) {
                    break;
                }
            }
            if (o00oooo0OooO00o == null) {
                throw new GlideException(this.f33512OooO0OO, new ArrayList(list));
            }
            this.f33510OooO00o.OooO00o(list);
            return o00oooo0OooO00o;
        } catch (Throwable th) {
            this.f33510OooO00o.OooO00o(list);
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("LoadPath{decodePaths=");
        sbOooO0o0.append(Arrays.toString(this.f33511OooO0O0.toArray()));
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
