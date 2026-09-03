package p065o0000oOO;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.io.PrintWriter;
import p190o00o0O.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LifecycleOwner f33794OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final OooO0O0 f33795OooO0O0;

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
            sb.append(" #0 : ");
            o000OO.OooO0O0.OooO00o(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    public static class OooO0O0 extends ViewModel {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO00o f33796OooO0O0 = new OooO00o();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Oooo000<OooO00o> f33797OooO00o = new Oooo000<>();

        public static class OooO00o implements ViewModelProvider.Factory {
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
                return androidx.lifecycle.Oooo000.OooO0O0(this, cls, creationExtras);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NonNull
            public final <T extends ViewModel> T create(@NonNull Class<T> cls) {
                return new OooO0O0();
            }
        }

        @Override // androidx.lifecycle.ViewModel
        public final void onCleared() {
            super.onCleared();
            Oooo000<OooO00o> oooo000 = this.f33797OooO00o;
            if (oooo000.OooO() > 0) {
                oooo000.OooOO0(0).getClass();
                throw null;
            }
            int i = oooo000.f38584OooO0oO;
            Object[] objArr = oooo000.f38582OooO0o;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            oooo000.f38584OooO0oO = 0;
            oooo000.f38581OooO0Oo = false;
        }
    }

    public o0OOO0o(@NonNull LifecycleOwner lifecycleOwner, @NonNull ViewModelStore viewModelStore) {
        this.f33794OooO00o = lifecycleOwner;
        this.f33795OooO0O0 = (OooO0O0) new ViewModelProvider(viewModelStore, OooO0O0.f33796OooO0O0).get(OooO0O0.class);
    }

    @Deprecated
    public final void OooO0O0(String str, PrintWriter printWriter) {
        Oooo000<OooO00o> oooo000 = this.f33795OooO0O0.f33797OooO00o;
        if (oooo000.OooO() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (oooo000.OooO() <= 0) {
                return;
            }
            OooO00o oooO00oOooOO0 = oooo000.OooOO0(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(oooo000.OooO0oO(0));
            printWriter.print(": ");
            printWriter.println(oooO00oOooOO0.toString());
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
        o000OO.OooO0O0.OooO00o(this.f33794OooO00o, sb);
        sb.append("}}");
        return sb.toString();
    }
}
