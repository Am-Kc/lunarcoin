package nebular.core

import nebular.util.CryptoUtil
import java.security.PrivateKey
import java.security.PublicKey

/**
 * 区块链账户类：记录账户地址(address)和余额(balance)信息。
 * 区块链账户由一个公私钥对唯一标识，构造Account对象需要公钥。
 * 账户地址(address)可以由公钥运算推导，比特币和以太坊均采用了类似机制。
 * 账户余额(balance)通常会保存在文件或数据库内。
 */
open class Account(val publicKey: PublicKey) {

  val address: ByteArray
    get() = CryptoUtil.generateAddress(publicKey)
}
