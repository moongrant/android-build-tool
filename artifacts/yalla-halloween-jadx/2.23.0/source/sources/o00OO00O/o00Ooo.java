package o00OO00O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o000OOo;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo<Model, Data> implements o0OoOo0<Model, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o0OoOo0<Model, Data>> f37129OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OO.OooO<List<Throwable>> f37130OooO0O0;

    public static class OooO00o<Data> implements com.bumptech.glide.load.data.OooO0o<Data>, com.bumptech.glide.load.data.OooO0o.OooO00o<Data> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public List<Throwable> f37131OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.OooO0o<Data>> f37132OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f37133OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o000OO.OooO<List<Throwable>> f37134OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Priority f37135OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public com.bumptech.glide.load.data.OooO0o.OooO00o<? super Data> f37136OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f37137OooOO0;

        public OooO00o(@NonNull ArrayList arrayList, @NonNull o000OO.OooO oooO) {
            this.f37134OooO0o0 = oooO;
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f37132OooO0Oo = arrayList;
            this.f37133OooO0o = 0;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<Data> OooO00o() {
            return this.f37132OooO0Oo.get(0).OooO00o();
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
            List<Throwable> list = this.f37131OooO;
            if (list != null) {
                this.f37134OooO0o0.OooO00o(list);
            }
            this.f37131OooO = null;
            Iterator<com.bumptech.glide.load.data.OooO0o<Data>> it = this.f37132OooO0Oo.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0();
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
        public final void OooO0OO(@NonNull Exception exc) {
            List<Throwable> list = this.f37131OooO;
            o0000O00.OooO0O0(list);
            list.add(exc);
            OooO0o();
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0Oo(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super Data> oooO00o) {
            this.f37135OooO0oO = priority;
            this.f37136OooO0oo = oooO00o;
            this.f37131OooO = this.f37134OooO0o0.OooO0O0();
            this.f37132OooO0Oo.get(this.f37133OooO0o).OooO0Oo(priority, this);
            if (this.f37137OooOO0) {
                cancel();
            }
        }

        public final void OooO0o() {
            if (this.f37137OooOO0) {
                return;
            }
            if (this.f37133OooO0o < this.f37132OooO0Oo.size() - 1) {
                this.f37133OooO0o++;
                OooO0Oo(this.f37135OooO0oO, this.f37136OooO0oo);
            } else {
                o0000O00.OooO0O0(this.f37131OooO);
                this.f37136OooO0oo.OooO0OO(new GlideException("Fetch failed", new ArrayList(this.f37131OooO)));
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
        public final void OooO0o0(@Nullable Data data) {
            if (data != null) {
                this.f37136OooO0oo.OooO0o0(data);
            } else {
                OooO0o();
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void cancel() {
            this.f37137OooOO0 = true;
            Iterator<com.bumptech.glide.load.data.OooO0o<Data>> it = this.f37132OooO0Oo.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final DataSource getDataSource() {
            return this.f37132OooO0Oo.get(0).getDataSource();
        }
    }

    public o00Ooo(@NonNull ArrayList arrayList, @NonNull o000OO.OooO oooO) {
        this.f37129OooO00o = arrayList;
        this.f37130OooO0O0 = oooO;
    }

    @Override // o00OO00O.o0OoOo0
    public final boolean OooO00o(@NonNull Model model) {
        Iterator<o0OoOo0<Model, Data>> it = this.f37129OooO00o.iterator();
        while (it.hasNext()) {
            if (it.next().OooO00o(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o<Data> OooO0O0(@NonNull Model model, int i, int i2, @NonNull o00000 o00000Var) {
        o0OoOo0.OooO00o<Data> oooO00oOooO0O0;
        List<o0OoOo0<Model, Data>> list = this.f37129OooO00o;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        o000OOo o000ooo2 = null;
        for (int i3 = 0; i3 < size; i3++) {
            o0OoOo0<Model, Data> o0oooo0 = list.get(i3);
            if (o0oooo0.OooO00o(model) && (oooO00oOooO0O0 = o0oooo0.OooO0O0(model, i, i2, o00000Var)) != null) {
                arrayList.add(oooO00oOooO0O0.f37152OooO0OO);
                o000ooo2 = oooO00oOooO0O0.f37150OooO00o;
            }
        }
        if (arrayList.isEmpty() || o000ooo2 == null) {
            return null;
        }
        return new o0OoOo0.OooO00o<>(o000ooo2, new OooO00o(arrayList, this.f37130OooO0O0));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f37129OooO00o.toArray()) + '}';
    }
}
