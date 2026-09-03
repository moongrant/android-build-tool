package com.amazonaws.auth;

import OooO00o.OooO00o;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import p016OooOoO0.OooOo00;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public class QueryStringSigner extends AbstractAWSSigner {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.amazonaws.auth.Signer
    public final void OooO0O0(Request<?> request, AWSCredentials aWSCredentials) {
        String string;
        SignatureVersion signatureVersion = SignatureVersion.V2;
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        if (aWSCredentials instanceof AnonymousAWSCredentials) {
            return;
        }
        AWSCredentials aWSCredentialsOooOO0O = OooOO0O(aWSCredentials);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.OooO0O0("AWSAccessKeyId", aWSCredentialsOooOO0O.OooO0O0());
        defaultRequest.OooO0O0("SignatureVersion", signatureVersion.toString());
        int iOooOO0 = OooOO0(defaultRequest);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        defaultRequest.OooO0O0("Timestamp", simpleDateFormat.format(OooO(iOooOO0)));
        if (aWSCredentialsOooOO0O instanceof AWSSessionCredentials) {
            defaultRequest.OooO0O0("SecurityToken", ((AWSSessionCredentials) aWSCredentialsOooOO0O).OooO00o());
        }
        if (signatureVersion.equals(SignatureVersion.V1)) {
            Map<String, String> map = defaultRequest.f10288OooO0OO;
            StringBuilder sb = new StringBuilder();
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            treeMap.putAll(map);
            for (Map.Entry entry : treeMap.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append((String) entry.getValue());
            }
            string = sb.toString();
        } else {
            if (!signatureVersion.equals(signatureVersion)) {
                throw new AmazonClientException("Invalid Signature Version specified");
            }
            defaultRequest.OooO0O0("SignatureMethod", signingAlgorithm.toString());
            URI uri = defaultRequest.f10291OooO0o0;
            Map<String, String> map2 = defaultRequest.f10288OooO0OO;
            StringBuilder sbOooO00o = Oooo0.OooO00o(com.qiniu.android.http.request.Request.HttpMethodPOST, "\n");
            String strOooO00o = StringUtils.OooO00o(uri.getHost());
            if (HttpUtils.OooO0OO(uri)) {
                StringBuilder sbOooO00o2 = Oooo0.OooO00o(strOooO00o, CertificateUtil.DELIMITER);
                sbOooO00o2.append(uri.getPort());
                strOooO00o = sbOooO00o2.toString();
            }
            sbOooO00o.append(strOooO00o);
            sbOooO00o.append("\n");
            String strOooO0Oo = "";
            if (defaultRequest.f10291OooO0o0.getPath() != null) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
                sbOooO0o0.append(defaultRequest.f10291OooO0o0.getPath());
                strOooO0Oo = sbOooO0o0.toString();
            }
            if (defaultRequest.f10286OooO00o != null) {
                if (strOooO0Oo.length() > 0 && !strOooO0Oo.endsWith("/") && !defaultRequest.f10286OooO00o.startsWith("/")) {
                    strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, "/");
                }
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0(strOooO0Oo);
                sbOooO0o1.append(defaultRequest.f10286OooO00o);
                strOooO0Oo = sbOooO0o1.toString();
            } else if (!strOooO0Oo.endsWith("/")) {
                strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, "/");
            }
            if (!strOooO0Oo.startsWith("/")) {
                strOooO0Oo = OooOo00.OooO0Oo("/", strOooO0Oo);
            }
            if (strOooO0Oo.startsWith("//")) {
                strOooO0Oo = strOooO0Oo.substring(1);
            }
            sbOooO00o.append(strOooO0Oo);
            sbOooO00o.append("\n");
            sbOooO00o.append(OooO0oO(map2));
            string = sbOooO00o.toString();
        }
        defaultRequest.OooO0O0("Signature", OooOOO(string, aWSCredentialsOooOO0O.OooO0OO(), signingAlgorithm));
    }
}
