package com.google.android.gms.dynamic;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.LinkedList;
import p260o00ooo0.o00O0O;
import p260o00ooo0.o00Oo0;
import p260o00ooo0.o00Ooo;
import p260o00ooo0.o00oO0o;
import p260o00ooo0.o0OOO0o;
import p260o00ooo0.o0OoOo0;
import p260o00ooo0.o0ooOOo;
import p260o00ooo0.oo000o;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public T f15310OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Bundle f15311OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LinkedList<o0OOO0o> f15312OooO0OO;

    @KeepForSdk
    public DeferredLifecycleHelper() {
        new o0OoOo0(this);
    }

    @KeepForSdk
    public static void showGooglePlayUnavailableMessage(@NonNull FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        String strZad = zac.zad(context, iIsGooglePlayServicesAvailable);
        String strZac = zac.zac(context, iIsGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strZad);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strZac);
            linearLayout.addView(button);
            button.setOnClickListener(new oo000o(context, errorResolutionIntent));
        }
    }

    @KeepForSdk
    public abstract void OooO00o();

    public final void OooO0O0(int i) {
        while (!this.f15312OooO0OO.isEmpty() && this.f15312OooO0OO.getLast().zaa() >= i) {
            this.f15312OooO0OO.removeLast();
        }
    }

    public final void OooO0OO(@Nullable Bundle bundle, o0OOO0o o0ooo0o2) {
        if (this.f15310OooO00o != null) {
            o0ooo0o2.zab();
            return;
        }
        if (this.f15312OooO0OO == null) {
            this.f15312OooO0OO = new LinkedList<>();
        }
        this.f15312OooO0OO.add(o0ooo0o2);
        if (bundle != null) {
            Bundle bundle2 = this.f15311OooO0O0;
            if (bundle2 == null) {
                this.f15311OooO0O0 = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        OooO00o();
    }

    @NonNull
    @KeepForSdk
    public T getDelegate() {
        return this.f15310OooO00o;
    }

    @KeepForSdk
    public void onCreate(@Nullable Bundle bundle) {
        OooO0OO(bundle, new o00Oo0(this, bundle));
    }

    @NonNull
    @KeepForSdk
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        OooO0OO(bundle, new o00Ooo(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f15310OooO00o == null) {
            showGooglePlayUnavailableMessage(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    public void onDestroy() {
        T t = this.f15310OooO00o;
        if (t != null) {
            t.onDestroy();
        } else {
            OooO0O0(1);
        }
    }

    @KeepForSdk
    public void onDestroyView() {
        T t = this.f15310OooO00o;
        if (t != null) {
            t.onDestroyView();
        } else {
            OooO0O0(2);
        }
    }

    @KeepForSdk
    public void onInflate(@NonNull Activity activity, @NonNull Bundle bundle, @Nullable Bundle bundle2) {
        OooO0OO(bundle2, new o00O0O(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    public void onLowMemory() {
        T t = this.f15310OooO00o;
        if (t != null) {
            t.onLowMemory();
        }
    }

    @KeepForSdk
    public void onPause() {
        T t = this.f15310OooO00o;
        if (t != null) {
            t.onPause();
        } else {
            OooO0O0(5);
        }
    }

    @KeepForSdk
    public void onResume() {
        OooO0OO(null, new o0ooOOo(this));
    }

    @KeepForSdk
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        T t = this.f15310OooO00o;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f15311OooO0O0;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    public void onStart() {
        OooO0OO(null, new o00oO0o(this));
    }

    @KeepForSdk
    public void onStop() {
        T t = this.f15310OooO00o;
        if (t != null) {
            t.onStop();
        } else {
            OooO0O0(4);
        }
    }
}
