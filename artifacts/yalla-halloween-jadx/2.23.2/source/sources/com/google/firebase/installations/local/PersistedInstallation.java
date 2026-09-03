package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p626o0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class PersistedInstallation {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public File f19736OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o0OOO0o f19737OooO0O0;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(@NonNull o0OOO0o o0ooo0o2) {
        this.f19737OooO0O0 = o0ooo0o2;
    }

    public final File OooO00o() {
        if (this.f19736OooO00o == null) {
            synchronized (this) {
                if (this.f19736OooO00o == null) {
                    o0OOO0o o0ooo0o2 = this.f19737OooO0O0;
                    o0ooo0o2.OooO00o();
                    this.f19736OooO00o = new File(o0ooo0o2.f57662OooO00o.getFilesDir(), "PersistedInstallation." + this.f19737OooO0O0.OooO0Oo() + ".json");
                }
            }
        }
        return this.f19736OooO00o;
    }

    @NonNull
    public final void OooO0O0(@NonNull OooO00o oooO00o) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", oooO00o.f19721OooO0O0);
            jSONObject.put("Status", oooO00o.f19722OooO0OO.ordinal());
            jSONObject.put("AuthToken", oooO00o.f19723OooO0Oo);
            jSONObject.put("RefreshToken", oooO00o.f19725OooO0o0);
            jSONObject.put("TokenCreationEpochInSecs", oooO00o.f19726OooO0oO);
            jSONObject.put("ExpiresInSecs", oooO00o.f19724OooO0o);
            jSONObject.put("FisError", oooO00o.f19727OooO0oo);
            o0OOO0o o0ooo0o2 = this.f19737OooO0O0;
            o0ooo0o2.OooO00o();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", o0ooo0o2.f57662OooO00o.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(OooO00o())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @NonNull
    public final OooO00o OooO0OO() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(OooO00o());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        RegistrationStatus registrationStatus = RegistrationStatus.ATTEMPT_MIGRATION;
        int iOptInt = jSONObject.optInt("Status", registrationStatus.ordinal());
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = OooO0O0.f19735OooO00o;
        OooO00o.C0255OooO00o c0255OooO00o = new OooO00o.C0255OooO00o();
        c0255OooO00o.f19732OooO0o = 0L;
        c0255OooO00o.OooO0O0(registrationStatus);
        c0255OooO00o.f19733OooO0o0 = 0L;
        c0255OooO00o.f19728OooO00o = strOptString;
        c0255OooO00o.OooO0O0(RegistrationStatus.values()[iOptInt]);
        c0255OooO00o.f19730OooO0OO = strOptString2;
        c0255OooO00o.f19731OooO0Oo = strOptString3;
        c0255OooO00o.f19732OooO0o = Long.valueOf(jOptLong);
        c0255OooO00o.f19733OooO0o0 = Long.valueOf(jOptLong2);
        c0255OooO00o.f19734OooO0oO = strOptString4;
        return c0255OooO00o.OooO00o();
    }
}
