/*
 * This file is generated by jOOQ.
 */
package io.exflo.postgres.jooq;


import io.exflo.postgres.jooq.tables.Account;
import io.exflo.postgres.jooq.tables.BalanceDelta;
import io.exflo.postgres.jooq.tables.BlockHeader;
import io.exflo.postgres.jooq.tables.BlockTrace;
import io.exflo.postgres.jooq.tables.ContractCreated;
import io.exflo.postgres.jooq.tables.ContractDestroyed;
import io.exflo.postgres.jooq.tables.ContractEvent;
import io.exflo.postgres.jooq.tables.FlywaySchemaHistory;
import io.exflo.postgres.jooq.tables.FungibleTokenTransfer;
import io.exflo.postgres.jooq.tables.ImportQueue;
import io.exflo.postgres.jooq.tables.InternalTransaction;
import io.exflo.postgres.jooq.tables.Metadata;
import io.exflo.postgres.jooq.tables.NonFungibleTokenTransfer;
import io.exflo.postgres.jooq.tables.Ommer;
import io.exflo.postgres.jooq.tables.Reward;
import io.exflo.postgres.jooq.tables.Transaction;
import io.exflo.postgres.jooq.tables.TransactionReceipt;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.account</code>.
     */
    public static final Account ACCOUNT = Account.ACCOUNT;

    /**
     * The table <code>public.balance_delta</code>.
     */
    public static final BalanceDelta BALANCE_DELTA = BalanceDelta.BALANCE_DELTA;

    /**
     * The table <code>public.block_header</code>.
     */
    public static final BlockHeader BLOCK_HEADER = BlockHeader.BLOCK_HEADER;

    /**
     * The table <code>public.block_trace</code>.
     */
    public static final BlockTrace BLOCK_TRACE = BlockTrace.BLOCK_TRACE;

    /**
     * The table <code>public.contract_created</code>.
     */
    public static final ContractCreated CONTRACT_CREATED = ContractCreated.CONTRACT_CREATED;

    /**
     * The table <code>public.contract_destroyed</code>.
     */
    public static final ContractDestroyed CONTRACT_DESTROYED = ContractDestroyed.CONTRACT_DESTROYED;

    /**
     * The table <code>public.contract_event</code>.
     */
    public static final ContractEvent CONTRACT_EVENT = ContractEvent.CONTRACT_EVENT;

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>public.fungible_token_transfer</code>.
     */
    public static final FungibleTokenTransfer FUNGIBLE_TOKEN_TRANSFER = FungibleTokenTransfer.FUNGIBLE_TOKEN_TRANSFER;

    /**
     * The table <code>public.import_queue</code>.
     */
    public static final ImportQueue IMPORT_QUEUE = ImportQueue.IMPORT_QUEUE;

    /**
     * The table <code>public.internal_transaction</code>.
     */
    public static final InternalTransaction INTERNAL_TRANSACTION = InternalTransaction.INTERNAL_TRANSACTION;

    /**
     * The table <code>public.metadata</code>.
     */
    public static final Metadata METADATA = Metadata.METADATA;

    /**
     * The table <code>public.non_fungible_token_transfer</code>.
     */
    public static final NonFungibleTokenTransfer NON_FUNGIBLE_TOKEN_TRANSFER = NonFungibleTokenTransfer.NON_FUNGIBLE_TOKEN_TRANSFER;

    /**
     * The table <code>public.ommer</code>.
     */
    public static final Ommer OMMER = Ommer.OMMER;

    /**
     * The table <code>public.reward</code>.
     */
    public static final Reward REWARD = Reward.REWARD;

    /**
     * The table <code>public.transaction</code>.
     */
    public static final Transaction TRANSACTION = Transaction.TRANSACTION;

    /**
     * The table <code>public.transaction_receipt</code>.
     */
    public static final TransactionReceipt TRANSACTION_RECEIPT = TransactionReceipt.TRANSACTION_RECEIPT;
}
