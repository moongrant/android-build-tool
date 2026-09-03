package p082o000OoOO;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.io.PrintWriter;
import java.util.Objects;
import p021OooOooo.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LifecycleOwner f28358OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final OooO0O0 f28359OooO0O0;

    public static class OooO00o<D> extends MutableLiveData<D> {
        @Override // androidx.lifecycle.LiveData
        public final void onActive() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public final void onInactive() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void removeObserver(@NonNull Observer<? super D> observer) {
            super.removeObserver(observer);
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public final void setValue(D d) {
            super.setValue(d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            o000OO0O.OooO0O0.OooO00o(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    public static class OooO0O0 extends ViewModel {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO00o f28360OooO0O0 = new OooO00o();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o0ooOOo<OooO00o> f28361OooO00o = new o0ooOOo<>();

        public static class OooO00o implements ViewModelProvider.Factory {
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NonNull
            public final <T extends ViewModel> T create(@NonNull Class<T> cls) {
                return new OooO0O0();
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
                return androidx.lifecycle.OooOOOO.OooO0O0(this, cls, creationExtras);
            }
        }

        @Override // androidx.lifecycle.ViewModel
        public final void onCleared() {
            super.onCleared();
            if (this.f28361OooO00o.OooOO0o() > 0) {
                Objects.requireNonNull(this.f28361OooO00o.OooOOO0(0));
                throw null;
            }
            o0ooOOo<OooO00o> o0ooooo2 = this.f28361OooO00o;
            int i = o0ooooo2.f435Oooo;
            Object[] objArr = o0ooooo2.f438Oooo0oo;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            o0ooooo2.f435Oooo = 0;
            o0ooooo2.f436Oooo0o = false;
        }
    }

    public OooOOOO(@NonNull LifecycleOwner lifecycleOwner, @NonNull ViewModelStore viewModelStore) {
        this.f28358OooO00o = lifecycleOwner;
        this.f28359OooO0O0 = (OooO0O0) new ViewModelProvider(viewModelStore, OooO0O0.f28360OooO0O0).get(OooO0O0.class);
    }

    @Override // p082o000OoOO.OooOOO
    @Deprecated
    public final void OooO00o(String str, PrintWriter printWriter) {
        OooO0O0 oooO0O0 = this.f28359OooO0O0;
        if (oooO0O0.f28361OooO00o.OooOO0o() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (oooO0O0.f28361OooO00o.OooOO0o() <= 0) {
                return;
            }
            OooO00o oooO00oOooOOO0 = oooO0O0.f28361OooO00o.OooOOO0(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(oooO0O0.f28361OooO00o.OooOO0(0));
            printWriter.print(": ");
            printWriter.println(oooO00oOooOOO0.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        o000OO0O.OooO0O0.OooO00o(this.f28358OooO00o, sb);
        sb.append("}}");
        return sb.toString();
    }
}
