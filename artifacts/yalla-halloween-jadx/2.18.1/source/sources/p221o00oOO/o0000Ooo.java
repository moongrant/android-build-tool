package p221o00oOO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO0o;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o000OO0O.OooO;
import p217o00oO00o.o00000;
import p217o00oO00o.o000000;
import p243o00oo00O.o000;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo<Model, Data> implements o00000O0<Model, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o00000O0<Model, Data>> f33715OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO<List<Throwable>> f33716OooO0O0;

    public static class OooO00o<Data> implements OooO0o<Data>, OooO0o.OooO00o<Data> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Priority f33717Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final List<OooO0o<Data>> f33718Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final OooO<List<Throwable>> f33719Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f33720Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @Nullable
        public List<Throwable> f33721OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public OooO0o.OooO00o<? super Data> f33722OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public boolean f33723OoooO0O;

        public OooO00o(@NonNull List<OooO0o<Data>> list, @NonNull OooO<List<Throwable>> oooO) {
            this.f33719Oooo0oO = oooO;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f33718Oooo0o = list;
            this.f33720Oooo0oo = 0;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<Data> OooO00o() {
            return this.f33718Oooo0o.get(0).OooO00o();
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
            List<Throwable> list = this.f33721OoooO0;
            if (list != null) {
                this.f33719Oooo0oO.OooO00o(list);
            }
            this.f33721OoooO0 = null;
            Iterator<OooO0o<Data>> it = this.f33718Oooo0o.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0();
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
        public final void OooO0OO(@NonNull Exception exc) {
            List<Throwable> list = this.f33721OoooO0;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            OooO0oO();
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final DataSource OooO0Oo() {
            return this.f33718Oooo0o.get(0).OooO0Oo();
        }

        @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
        public final void OooO0o(@Nullable Data data) {
            if (data != null) {
                this.f33722OoooO00.OooO0o(data);
            } else {
                OooO0oO();
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0o0(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super Data> oooO00o) {
            this.f33717Oooo = priority;
            this.f33722OoooO00 = oooO00o;
            this.f33721OoooO0 = this.f33719Oooo0oO.OooO0O0();
            this.f33718Oooo0o.get(this.f33720Oooo0oo).OooO0o0(priority, this);
            if (this.f33723OoooO0O) {
                cancel();
            }
        }

        public final void OooO0oO() {
            if (this.f33723OoooO0O) {
                return;
            }
            if (this.f33720Oooo0oo < this.f33718Oooo0o.size() - 1) {
                this.f33720Oooo0oo++;
                OooO0o0(this.f33717Oooo, this.f33722OoooO00);
            } else {
                o000.OooO0O0(this.f33721OoooO0);
                this.f33722OoooO00.OooO0OO(new GlideException("Fetch failed", new ArrayList(this.f33721OoooO0)));
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void cancel() {
            this.f33723OoooO0O = true;
            Iterator<OooO0o<Data>> it = this.f33718Oooo0o.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }
    }

    public o0000Ooo(@NonNull List<o00000O0<Model, Data>> list, @NonNull OooO<List<Throwable>> oooO) {
        this.f33715OooO00o = list;
        this.f33716OooO0O0 = oooO;
    }

    @Override // p221o00oOO.o00000O0
    public final boolean OooO00o(@NonNull Model model) {
        Iterator<o00000O0<Model, Data>> it = this.f33715OooO00o.iterator();
        while (it.hasNext()) {
            if (it.next().OooO00o(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o<Data> OooO0O0(@NonNull Model model, int i, int i2, @NonNull o00000 o00000Var) {
        o00000O0.OooO00o<Data> oooO00oOooO0O0;
        int size = this.f33715OooO00o.size();
        ArrayList arrayList = new ArrayList(size);
        o000000 o000000Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            o00000O0<Model, Data> o00000o1 = this.f33715OooO00o.get(i3);
            if (o00000o1.OooO00o(model) && (oooO00oOooO0O0 = o00000o1.OooO0O0(model, i, i2, o00000Var)) != null) {
                o000000Var = oooO00oOooO0O0.f33696OooO00o;
                arrayList.add(oooO00oOooO0O0.f33698OooO0OO);
            }
        }
        if (arrayList.isEmpty() || o000000Var == null) {
            return null;
        }
        return new o00000O0.OooO00o<>(o000000Var, new OooO00o(arrayList, this.f33716OooO0O0));
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("MultiModelLoader{modelLoaders=");
        sbOooO0o0.append(Arrays.toString(this.f33715OooO00o.toArray()));
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
