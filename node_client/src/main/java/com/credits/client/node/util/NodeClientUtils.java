package com.credits.client.node.util;

import com.credits.client.node.exception.NodeClientException;
import com.credits.client.node.pojo.SmartContractData;
import com.credits.client.node.thrift.generated.SmartContractInvocation;
import com.credits.general.pojo.ApiResponseCode;
import com.credits.general.thrift.generated.APIResponse;
import lombok.NonNull;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.credits.client.node.util.NodePojoConverter.smartContractDataToSmartContract;
import static com.credits.general.pojo.ApiResponseCode.NOT_FOUND;
import static com.credits.general.pojo.ApiResponseCode.SUCCESS;


public class NodeClientUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(NodeClientUtils.class.getName());

    public static void logApiResponse(APIResponse apiResponse) {
        byte resultCode = apiResponse.getCode();
        String resultMessage = apiResponse.getMessage();
        LOGGER.info(String.format("<--- resultCode = %s; resultMessage = %s", resultCode, resultMessage));
    }

    public static void processApiResponse(APIResponse apiResponse) throws NodeClientException {
        ApiResponseCode resultCode = ApiResponseCode.valueOf((int)apiResponse.getCode());
        if (resultCode != SUCCESS && resultCode != NOT_FOUND) {
            String resultMessage = apiResponse.getMessage();
            throw new NodeClientException(String.format("Credits Node error: %s", resultMessage));
        }
    }

    public static byte[] serializeByThrift(@NonNull SmartContractData smartContractData) {
        final var smartContract = smartContractDataToSmartContract(smartContractData);
        return serializeThriftStructure(smartContract);
    }

    public static byte[] serializeByThrift(@NonNull SmartContractInvocation smartContract) {
        return serializeThriftStructure(smartContract);
    }

    public static byte[] serializeThriftStructure(@NonNull TBase<?, ?> structure) {
        final var thriftSerializer = new TSerializer();
        try {
            return thriftSerializer.serialize(structure);
        } catch (TException e) {
            throw new NodeClientException(e);
        }
    }
}
