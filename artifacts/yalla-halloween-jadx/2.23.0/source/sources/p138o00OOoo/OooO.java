package p138o00OOoo;

import android.content.Context;
import com.amazonaws.auth.AWSAbstractCognitoDeveloperIdentityProvider;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.regions.Regions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p136o00OOOo0.OooOO0;
import p136o00OOOo0.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    public static final class OooO00o extends AWSAbstractCognitoDeveloperIdentityProvider {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public String f37429OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NotNull
        public String f37430OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull String identityPoolId, @NotNull String regions) {
            super(identityPoolId, Regions.OooO00o(regions));
            Intrinsics.checkNotNullParameter(identityPoolId, "identityPoolId");
            Intrinsics.checkNotNullParameter(regions, "regions");
            this.f37429OooO0oO = "";
            this.f37430OooO0oo = "";
        }

        @Override // com.amazonaws.auth.AWSIdentityProvider
        @NotNull
        public final String OooO0O0() {
            String str = this.f37429OooO0oO;
            this.f9000OooO0O0 = str;
            String str2 = this.f37430OooO0oo;
            this.f9002OooO0Oo = str2;
            if (str == null || !str.equals(str)) {
                OooO00o(str);
            }
            String str3 = this.f9002OooO0Oo;
            if (str3 == null || !str3.equals(str2)) {
                this.f9002OooO0Oo = str2;
            }
            String token = this.f9002OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(token, "token");
            return token;
        }

        @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
        @NotNull
        public final String OooO0o() {
            return this.f37429OooO0oO;
        }
    }

    public static final OooOO0O OooO00o(OooO oooO, OooOo.OooO00o oooO00o) {
        oooO.getClass();
        Context context = OooOO0.f37361OooO0o0;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        String str = oooO00o.f37402OooO0oO;
        String str2 = oooO00o.f37403OooO0oo;
        OooO00o oooO00o2 = new OooO00o(str, str2);
        String str3 = oooO00o.f37400OooO0o;
        Intrinsics.checkNotNullParameter(str3, "<set-?>");
        oooO00o2.f37429OooO0oO = str3;
        Intrinsics.checkNotNullParameter(oooO00o.f37401OooO0o0, "<set-?>");
        String str4 = oooO00o.f37397OooO;
        Intrinsics.checkNotNullParameter(str4, "<set-?>");
        oooO00o2.f37430OooO0oo = str4;
        return new OooOO0O(new CognitoCachingCredentialsProvider(context, oooO00o2, Regions.OooO00o(str2)), RegionUtils.OooO00o(str2));
    }
}
