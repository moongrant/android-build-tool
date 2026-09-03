package androidx.lifecycle;

import android.widget.EditText;
import com.google.android.material.internal.oo0o0Oo;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f6090OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f6091OooO0o0;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f6090OooO0Oo = i;
        this.f6091OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6090OooO0Oo;
        Object obj = this.f6091OooO0o0;
        switch (i) {
            case 0:
                PublisherLiveData.LiveDataSubscriber.onError$lambda$0((Throwable) obj);
                break;
            default:
                SearchView searchView = (SearchView) obj;
                EditText editText = searchView.f17071OooOOO0;
                editText.clearFocus();
                SearchBar searchBar = searchView.f17078OooOo0;
                if (searchBar != null) {
                    searchBar.requestFocus();
                }
                oo0o0Oo.OooO0o0(editText, searchView.f17082OooOoO);
                break;
        }
    }
}
