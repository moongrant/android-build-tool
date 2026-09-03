package p179o00o00;

import android.content.Context;
import com.amazonaws.auth.AWSAbstractCognitoDeveloperIdentityProvider;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.regions.Regions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p182o00o000O.OooOO0O;
import p182o00o000O.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    public static final class OooO00o extends AWSAbstractCognitoDeveloperIdentityProvider {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public String f38366OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NotNull
        public String f38367OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull String identityPoolId, @NotNull String regions) {
            super(identityPoolId, Regions.OooO00o(regions));
            Intrinsics.checkNotNullParameter(identityPoolId, "identityPoolId");
            Intrinsics.checkNotNullParameter(regions, "regions");
            this.f38366OooO0oO = "";
            this.f38367OooO0oo = "";
        }

        @Override // com.amazonaws.auth.AWSIdentityProvider
        @NotNull
        public final String OooO0O0() {
            String str = this.f38366OooO0oO;
            this.f12090OooO0O0 = str;
            String str2 = this.f38367OooO0oo;
            this.f12092OooO0Oo = str2;
            if (str == null || !str.equals(str)) {
                OooO00o(str);
            }
            String str3 = this.f12092OooO0Oo;
            if (str3 == null || !str3.equals(str2)) {
                this.f12092OooO0Oo = str2;
            }
            String token = this.f12092OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(token, "token");
            return token;
        }

        @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
        @NotNull
        public final String OooO0o() {
            return this.f38366OooO0oO;
        }
    }

    public static final OooOO0O OooO00o(OooO oooO, Oooo000.OooO00o oooO00o) {
        oooO.getClass();
        Context context = OooOO0O.f38411OooO0o0;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        String str = oooO00o.f38471OooO0oO;
        String str2 = oooO00o.f38472OooO0oo;
        OooO00o oooO00o2 = new OooO00o(str, str2);
        String str3 = oooO00o.f38469OooO0o;
        Intrinsics.checkNotNullParameter(str3, "<set-?>");
        oooO00o2.f38366OooO0oO = str3;
        Intrinsics.checkNotNullParameter(oooO00o.f38470OooO0o0, "<set-?>");
        String str4 = oooO00o.f38466OooO;
        Intrinsics.checkNotNullParameter(str4, "<set-?>");
        oooO00o2.f38367OooO0oo = str4;
        return new OooOO0O(new CognitoCachingCredentialsProvider(context, oooO00o2, Regions.OooO00o(str2)), RegionUtils.OooO00o(str2));
    }
}
