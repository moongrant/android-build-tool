package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p281o0O0O0oO.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class PersistedInstallation {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public File f20208OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final OooOO0 f20209OooO0O0;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(@NonNull OooOO0 oooOO1) {
        this.f20209OooO0O0 = oooOO1;
    }

    public final File OooO00o() {
        if (this.f20208OooO00o == null) {
            synchronized (this) {
                if (this.f20208OooO00o == null) {
                    OooOO0 oooOO1 = this.f20209OooO0O0;
                    oooOO1.OooO00o();
                    this.f20208OooO00o = new File(oooOO1.f41949OooO00o.getFilesDir(), "PersistedInstallation." + this.f20209OooO0O0.OooO0Oo() + ".json");
                }
            }
        }
        return this.f20208OooO00o;
    }

    @NonNull
    public final void OooO0O0(@NonNull OooO00o oooO00o) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", oooO00o.f20193OooO0O0);
            jSONObject.put("Status", oooO00o.f20194OooO0OO.ordinal());
            jSONObject.put("AuthToken", oooO00o.f20195OooO0Oo);
            jSONObject.put("RefreshToken", oooO00o.f20197OooO0o0);
            jSONObject.put("TokenCreationEpochInSecs", oooO00o.f20198OooO0oO);
            jSONObject.put("ExpiresInSecs", oooO00o.f20196OooO0o);
            jSONObject.put("FisError", oooO00o.f20199OooO0oo);
            OooOO0 oooOO1 = this.f20209OooO0O0;
            oooOO1.OooO00o();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", oooOO1.f41949OooO00o.getFilesDir());
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
        int i2 = OooO0O0.f20207OooO00o;
        OooO00o.C0256OooO00o c0256OooO00o = new OooO00o.C0256OooO00o();
        c0256OooO00o.f20204OooO0o = 0L;
        c0256OooO00o.OooO0O0(registrationStatus);
        c0256OooO00o.f20205OooO0o0 = 0L;
        c0256OooO00o.f20200OooO00o = strOptString;
        c0256OooO00o.OooO0O0(RegistrationStatus.values()[iOptInt]);
        c0256OooO00o.f20202OooO0OO = strOptString2;
        c0256OooO00o.f20203OooO0Oo = strOptString3;
        c0256OooO00o.f20204OooO0o = Long.valueOf(jOptLong);
        c0256OooO00o.f20205OooO0o0 = Long.valueOf(jOptLong2);
        c0256OooO00o.f20206OooO0oO = strOptString4;
        return c0256OooO00o.OooO00o();
    }
}
