package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzb;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("PlatformActivityProxy")
@zzl
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public ResultReceiver f12767OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f12768OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public ResultReceiver f12769OooO0o0;

    public final Intent OooO00o() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    @zzl
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Intent intentOooO00o;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int i3 = zzb.zzi(intent, "ProxyBillingActivity").f12746OooO00o;
            if (i2 != -1) {
                zzb.zzo("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
            } else if (i3 != 0) {
                i2 = -1;
                zzb.zzo("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
            } else {
                i3 = 0;
            }
            ResultReceiver resultReceiver = this.f12767OooO0Oo;
            if (resultReceiver != null) {
                resultReceiver.send(i3, intent != null ? intent.getExtras() : null);
            } else {
                if (intent == null) {
                    intentOooO00o = OooO00o();
                } else if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        intentOooO00o = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                        intentOooO00o.setPackage(getApplicationContext().getPackageName());
                        intentOooO00o.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    } else {
                        Intent intentOooO00o2 = OooO00o();
                        intentOooO00o2.putExtras(intent.getExtras());
                        intentOooO00o = intentOooO00o2;
                    }
                } else {
                    intentOooO00o = OooO00o();
                    zzb.zzo("ProxyBillingActivity", "Got null bundle!");
                    intentOooO00o.putExtra("RESPONSE_CODE", 6);
                    intentOooO00o.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                }
                sendBroadcast(intentOooO00o);
            }
        } else if (i == 101) {
            int iZza = zzb.zza(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver2 = this.f12769OooO0o0;
            if (resultReceiver2 != null) {
                resultReceiver2.send(iZza, intent != null ? intent.getExtras() : null);
            }
        } else {
            zzb.zzo("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.f12768OooO0o = false;
        finish();
    }

    @Override // android.app.Activity
    @zzl
    public final void onCreate(@Nullable Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            zzb.zzn("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f12768OooO0o = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f12767OooO0Oo = (ResultReceiver) bundle.getParcelable("result_receiver");
                return;
            } else {
                if (bundle.containsKey("in_app_message_result_receiver")) {
                    this.f12769OooO0o0 = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
                    return;
                }
                return;
            }
        }
        zzb.zzn("ProxyBillingActivity", "Launching Play Store billing flow");
        int i = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f12767OooO0Oo = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f12769OooO0o0 = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            i = 101;
        } else {
            pendingIntent = null;
        }
        int i2 = i;
        try {
            this.f12768OooO0o = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i2, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            zzb.zzp("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.f12767OooO0Oo;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f12769OooO0o0;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentOooO00o = OooO00o();
                    intentOooO00o.putExtra("RESPONSE_CODE", 6);
                    intentOooO00o.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentOooO00o);
                }
            }
            this.f12768OooO0o = false;
            finish();
        }
    }

    @Override // android.app.Activity
    @zzl
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f12768OooO0o) {
            Intent intentOooO00o = OooO00o();
            intentOooO00o.putExtra("RESPONSE_CODE", 1);
            intentOooO00o.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentOooO00o);
        }
    }

    @Override // android.app.Activity
    @zzl
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        ResultReceiver resultReceiver = this.f12767OooO0Oo;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f12769OooO0o0;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f12768OooO0o);
    }
}
