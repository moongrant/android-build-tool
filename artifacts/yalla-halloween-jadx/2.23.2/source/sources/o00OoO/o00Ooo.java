package o00OoO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo<Model, Data> implements o0OoOo0<Model, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o0OoOo0<Model, Data>> f37891OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OO.OooO<List<Throwable>> f37892OooO0O0;

    public static class OooO00o<Data> implements com.bumptech.glide.load.data.OooO0o<Data>, com.bumptech.glide.load.data.OooO0o.OooO00o<Data> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public List<Throwable> f37893OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.OooO0o<Data>> f37894OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f37895OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o000OO.OooO<List<Throwable>> f37896OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Priority f37897OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public com.bumptech.glide.load.data.OooO0o.OooO00o<? super Data> f37898OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f37899OooOO0;

        public OooO00o(@NonNull ArrayList arrayList, @NonNull o000OO.OooO oooO) {
            this.f37896OooO0o0 = oooO;
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f37894OooO0Oo = arrayList;
            this.f37895OooO0o = 0;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<Data> OooO00o() {
            return this.f37894OooO0Oo.get(0).OooO00o();
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
            List<Throwable> list = this.f37893OooO;
            if (list != null) {
                this.f37896OooO0o0.OooO00o(list);
            }
            this.f37893OooO = null;
            Iterator<com.bumptech.glide.load.data.OooO0o<Data>> it = this.f37894OooO0Oo.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0();
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
        public final void OooO0OO(@NonNull Exception exc) {
            List<Throwable> list = this.f37893OooO;
            o00OO00O.OooO0O0(list);
            list.add(exc);
            OooO0o();
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0Oo(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super Data> oooO00o) {
            this.f37897OooO0oO = priority;
            this.f37898OooO0oo = oooO00o;
            this.f37893OooO = this.f37896OooO0o0.OooO0O0();
            this.f37894OooO0Oo.get(this.f37895OooO0o).OooO0Oo(priority, this);
            if (this.f37899OooOO0) {
                cancel();
            }
        }

        public final void OooO0o() {
            if (this.f37899OooOO0) {
                return;
            }
            if (this.f37895OooO0o < this.f37894OooO0Oo.size() - 1) {
                this.f37895OooO0o++;
                OooO0Oo(this.f37897OooO0oO, this.f37898OooO0oo);
            } else {
                o00OO00O.OooO0O0(this.f37893OooO);
                this.f37898OooO0oo.OooO0OO(new GlideException("Fetch failed", new ArrayList(this.f37893OooO)));
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
        public final void OooO0o0(@Nullable Data data) {
            if (data != null) {
                this.f37898OooO0oo.OooO0o0(data);
            } else {
                OooO0o();
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void cancel() {
            this.f37899OooOO0 = true;
            Iterator<com.bumptech.glide.load.data.OooO0o<Data>> it = this.f37894OooO0Oo.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final DataSource getDataSource() {
            return this.f37894OooO0Oo.get(0).getDataSource();
        }
    }

    public o00Ooo(@NonNull ArrayList arrayList, @NonNull o000OO.OooO oooO) {
        this.f37891OooO00o = arrayList;
        this.f37892OooO0O0 = oooO;
    }

    @Override // o00OoO.o0OoOo0
    public final boolean OooO00o(@NonNull Model model) {
        Iterator<o0OoOo0<Model, Data>> it = this.f37891OooO00o.iterator();
        while (it.hasNext()) {
            if (it.next().OooO00o(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // o00OoO.o0OoOo0
    public final o0OoOo0.OooO00o<Data> OooO0O0(@NonNull Model model, int i, int i2, @NonNull p154o00Oo0oo.oo0o0Oo oo0o0oo) {
        o0OoOo0.OooO00o<Data> oooO00oOooO0O0;
        List<o0OoOo0<Model, Data>> list = this.f37891OooO00o;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        p154o00Oo0oo.o0OOO0o o0ooo0o2 = null;
        for (int i3 = 0; i3 < size; i3++) {
            o0OoOo0<Model, Data> o0oooo1 = list.get(i3);
            if (o0oooo1.OooO00o(model) && (oooO00oOooO0O0 = o0oooo1.OooO0O0(model, i, i2, oo0o0oo)) != null) {
                arrayList.add(oooO00oOooO0O0.f37914OooO0OO);
                o0ooo0o2 = oooO00oOooO0O0.f37912OooO00o;
            }
        }
        if (arrayList.isEmpty() || o0ooo0o2 == null) {
            return null;
        }
        return new o0OoOo0.OooO00o<>(o0ooo0o2, new OooO00o(arrayList, this.f37892OooO0O0));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f37891OooO00o.toArray()) + '}';
    }
}
