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

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
@zzf
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public ResultReceiver f11246Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public ResultReceiver f11247Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f11248Oooo0oo;

    public final Intent OooO00o() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    @zzf
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int i3 = zzb.zzh(intent, "ProxyBillingActivity").f11236OooO00o;
            if (i2 != -1) {
                StringBuilder sb = new StringBuilder(85);
                sb.append("Activity finished with resultCode ");
                sb.append(i2);
                sb.append(" and billing's responseCode: ");
                sb.append(i3);
                zzb.zzn("ProxyBillingActivity", sb.toString());
            } else if (i3 != 0) {
                i2 = -1;
                StringBuilder sb2 = new StringBuilder(85);
                sb2.append("Activity finished with resultCode ");
                sb2.append(i2);
                sb2.append(" and billing's responseCode: ");
                sb2.append(i3);
                zzb.zzn("ProxyBillingActivity", sb2.toString());
            } else {
                i3 = 0;
            }
            ResultReceiver resultReceiver = this.f11246Oooo0o;
            if (resultReceiver != null) {
                resultReceiver.send(i3, intent != null ? intent.getExtras() : null);
            } else {
                Intent intentOooO00o = OooO00o();
                if (intent != null) {
                    if (intent.getExtras() != null) {
                        intentOooO00o.putExtras(intent.getExtras());
                    } else {
                        zzb.zzn("ProxyBillingActivity", "Got null bundle!");
                        intentOooO00o.putExtra("RESPONSE_CODE", 6);
                        intentOooO00o.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    }
                }
                sendBroadcast(intentOooO00o);
            }
        } else if (i == 101) {
            int iZza = zzb.zza(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver2 = this.f11247Oooo0oO;
            if (resultReceiver2 != null) {
                resultReceiver2.send(iZza, intent != null ? intent.getExtras() : null);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("Got onActivityResult with wrong requestCode: ");
            sb3.append(i);
            sb3.append("; skipping...");
            zzb.zzn("ProxyBillingActivity", sb3.toString());
        }
        this.f11248Oooo0oo = false;
        finish();
    }

    @Override // android.app.Activity
    @zzf
    public final void onCreate(@Nullable Bundle bundle) {
        PendingIntent pendingIntent;
        int i;
        super.onCreate(bundle);
        if (bundle != null) {
            zzb.zzm("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f11248Oooo0oo = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f11246Oooo0o = (ResultReceiver) bundle.getParcelable("result_receiver");
                return;
            } else {
                if (bundle.containsKey("in_app_message_result_receiver")) {
                    this.f11247Oooo0oO = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
                    return;
                }
                return;
            }
        }
        zzb.zzm("ProxyBillingActivity", "Launching Play Store billing flow");
        try {
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            } else {
                if (!getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                        pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                        this.f11247Oooo0oO = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                        i = 101;
                    } else {
                        pendingIntent = null;
                    }
                    this.f11248Oooo0oo = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
                    return;
                }
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f11246Oooo0o = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            }
            this.f11248Oooo0oo = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
            return;
        } catch (IntentSender.SendIntentException e) {
            zzb.zzo("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.f11246Oooo0o;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f11247Oooo0oO;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentOooO00o = OooO00o();
                    intentOooO00o.putExtra("RESPONSE_CODE", 6);
                    intentOooO00o.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentOooO00o);
                }
            }
            this.f11248Oooo0oo = false;
            finish();
            return;
        }
        i = 100;
    }

    @Override // android.app.Activity
    @zzf
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f11248Oooo0oo) {
            Intent intentOooO00o = OooO00o();
            intentOooO00o.putExtra("RESPONSE_CODE", 1);
            intentOooO00o.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentOooO00o);
        }
    }

    @Override // android.app.Activity
    @zzf
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        ResultReceiver resultReceiver = this.f11246Oooo0o;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f11247Oooo0oO;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f11248Oooo0oo);
    }
}
