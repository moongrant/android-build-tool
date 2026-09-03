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
import oo0ooO.OooO;
import oo0ooO.OooO00o;
import oo0ooO.OooO0O0;
import oo0ooO.OooO0OO;
import oo0ooO.OooO0o;
import oo0ooO.OooOO0;
import oo0ooO.OooOO0O;
import oo0ooO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public T f15817OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Bundle f15818OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LinkedList<OooOOO0> f15819OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OnDelegateCreatedListener<T> f15820OooO0Oo = new OooO00o(this);

    @KeepForSdk
    public DeferredLifecycleHelper() {
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
            button.setOnClickListener(new OooO(context, errorResolutionIntent));
        }
    }

    @KeepForSdk
    public abstract void OooO00o();

    public final void OooO0O0(int i) {
        while (!this.f15819OooO0OO.isEmpty() && this.f15819OooO0OO.getLast().zaa() >= i) {
            this.f15819OooO0OO.removeLast();
        }
    }

    public final void OooO0OO(@Nullable Bundle bundle, OooOOO0 oooOOO0) {
        if (this.f15817OooO00o != null) {
            oooOOO0.zab();
            return;
        }
        if (this.f15819OooO0OO == null) {
            this.f15819OooO0OO = new LinkedList<>();
        }
        this.f15819OooO0OO.add(oooOOO0);
        if (bundle != null) {
            Bundle bundle2 = this.f15818OooO0O0;
            if (bundle2 == null) {
                this.f15818OooO0O0 = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        OooO00o();
    }

    @NonNull
    @KeepForSdk
    public T getDelegate() {
        return this.f15817OooO00o;
    }

    @KeepForSdk
    public void onCreate(@Nullable Bundle bundle) {
        OooO0OO(bundle, new OooO0OO(this, bundle));
    }

    @NonNull
    @KeepForSdk
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        OooO0OO(bundle, new OooO0o(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f15817OooO00o == null) {
            showGooglePlayUnavailableMessage(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    public void onDestroy() {
        T t = this.f15817OooO00o;
        if (t != null) {
            t.onDestroy();
        } else {
            OooO0O0(1);
        }
    }

    @KeepForSdk
    public void onDestroyView() {
        T t = this.f15817OooO00o;
        if (t != null) {
            t.onDestroyView();
        } else {
            OooO0O0(2);
        }
    }

    @KeepForSdk
    public void onInflate(@NonNull Activity activity, @NonNull Bundle bundle, @Nullable Bundle bundle2) {
        OooO0OO(bundle2, new OooO0O0(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    public void onLowMemory() {
        T t = this.f15817OooO00o;
        if (t != null) {
            t.onLowMemory();
        }
    }

    @KeepForSdk
    public void onPause() {
        T t = this.f15817OooO00o;
        if (t != null) {
            t.onPause();
        } else {
            OooO0O0(5);
        }
    }

    @KeepForSdk
    public void onResume() {
        OooO0OO(null, new OooOO0O(this));
    }

    @KeepForSdk
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        T t = this.f15817OooO00o;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f15818OooO0O0;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    public void onStart() {
        OooO0OO(null, new OooOO0(this));
    }

    @KeepForSdk
    public void onStop() {
        T t = this.f15817OooO00o;
        if (t != null) {
            t.onStop();
        } else {
            OooO0O0(4);
        }
    }
}
